package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	public  WebDriverWait wait;

	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver(); }
		else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();  }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void login() throws IOException {
		FileLib fl = new FileLib();
		String url = fl.getPropertyData("url");
		String username = fl.getPropertyData("username");
		String password = fl.getPropertyData("password");
		driver.get(url);
		LoginPage lp = new LoginPage(driver);
		lp.setLogin(username, password);

	}

	@AfterTest
	public void logout() {
		HomePage hp = new HomePage(driver);
		hp.clickOnLogout();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
