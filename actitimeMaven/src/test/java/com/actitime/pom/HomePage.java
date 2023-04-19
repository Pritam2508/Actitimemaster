package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(id = "container_tasks")
	private WebElement tskbtn;

	@FindBy(id = "logoutLink")
	private WebElement logoutLink;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnTask() {
		tskbtn.click();
	}
	public void clickOnLogout() {
		logoutLink.click();
	}
}
