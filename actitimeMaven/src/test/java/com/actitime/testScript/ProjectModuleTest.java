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

public class ProjectModuleTest extends BaseClass {
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException {

		FileLib fl = new FileLib();
		String projectName = fl.getExcelData("CreateProject", 1, 3);
		String projectCustomerName = fl.getExcelData("CreateProject", 1, 4);
		String projectDescription = fl.getExcelData("CreateProject", 1, 5);
		String task = fl.getExcelData("CreateProject", 1, 6);
		HomePage hp = new HomePage(driver);
      //click on the task Tab
		hp.clickOnTask();
		TaskListPage tlp = new TaskListPage(driver);
      //click in the Add new Button
		tlp.getAddbtn().click();
      //click on the new Project icon
		tlp.getProjectIcon().click();
		//Enter the Project Name in the Project Name Textfield
		tlp.getProjectName().sendKeys(projectName);
		//click on the customer
		tlp.getCustomerDD().click();
		tlp.getTypeCustomer().sendKeys(projectCustomerName);
		tlp.getProjectcustName().click();
		tlp.getProjectDescription().sendKeys(projectDescription);
		tlp.getTaskName().sendKeys(task);
		tlp.getCreateprojectbutton().click();
		wait.until(ExpectedConditions.invisibilityOf(tlp.getProjectPopup()));
		String actualprojectName=tlp.getActualProjectName().getText();
		Assert.assertEquals(projectName, actualprojectName);

	}
}