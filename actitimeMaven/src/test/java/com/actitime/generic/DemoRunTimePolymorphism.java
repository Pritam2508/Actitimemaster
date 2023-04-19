package com.actitime.generic;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoRunTimePolymorphism {
public static WebDriver driver;
	public static void main(String[] args) {
		
		System.out.println("Enter the browser Name");
		Scanner sc=new Scanner(System.in);
		String browser=sc.nextLine();
		
		if(browser.equalsIgnoreCase("chrome"))
      driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demo.actitime.com");
  System.out.println(driver.getTitle());
  sc.close();
  driver.close();
	}

}
