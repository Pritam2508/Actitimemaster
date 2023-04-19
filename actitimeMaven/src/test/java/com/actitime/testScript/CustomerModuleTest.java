package com.actitime.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplimentation.class)

public class CustomerModuleTest extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		FileLib fl = new FileLib();
		String customerName = fl.getExcelData("CreateCustomer", 1, 3);
		String customerDescription = fl.getExcelData("CreateCustomer", 1, 4);
		HomePage hp = new HomePage(driver);
		//click on the task Tab
		hp.clickOnTask();
		TaskListPage tlp = new TaskListPage(driver);
		//click in the Add new Button
		tlp.getAddbtn().click();
		//click on the new customer icon
		tlp.getCustmbtn().click();
		//Enter the customer name in customer Name Text field
		tlp.getCstmrNametbx().sendKeys(customerName);
		//Enter the Customer Description in the Description 
		tlp.getCstmrdcrptbx().sendKeys(customerDescription);
		//Click on the Dropdown Menu
		tlp.getclickOnDropDown().click();
		//type our company in the text box
		tlp.setTypeCompany();
		//select our company from the option
		tlp.getOptionDropdown().click();
		//click on the create customer button
		tlp.getCrtcusbtn().click();
		wait.until(ExpectedConditions.invisibilityOf(tlp.getPopupWindow()));
		String actualcus = tlp.getActualcustName().getText();
		Assert.assertEquals(actualcus, customerName);
	}

}
