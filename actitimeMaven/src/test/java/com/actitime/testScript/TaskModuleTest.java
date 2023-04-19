package com.actitime.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListnerImplimentation.class)

public class TaskModuleTest extends BaseClass{
@Test
public void createTask() throws EncryptedDocumentException, IOException {
	FileLib fl=new FileLib();
	String projectName = fl.getExcelData("CreateTask", 1, 3);
	String taskCustomerName = fl.getExcelData("CreateTask", 1, 4);
	String task = fl.getExcelData("CreateTask", 1, 5);
	HomePage hp = new HomePage(driver);
  //click on the task Tab
	hp.clickOnTask();
	TaskListPage tlp = new TaskListPage(driver);
  //click in the Add new Button
	tlp.getAddbtn().click();
  //click on the new Task icon
	tlp.getNewTaskIcon().click();
	tlp.getClickTaskCustomerDD().click();
	tlp.getTypeTaskCustomerName().sendKeys(taskCustomerName);
	tlp.getSelectTaskCustomerName().click();
	tlp.getClickTaskProjectDD().click();
	tlp.getTypeTaskProjectName().sendKeys(projectName);
	tlp.getSelectTaskProjectName().click();
	tlp.getTypeTaskTaskName().sendKeys(task);
	tlp.getCreateTaskbutton().click();
	wait.until(ExpectedConditions.invisibilityOf(tlp.getTaskPopup()));
	String actualTaskName=tlp.getActualTaskName().getText();
	Assert.assertEquals(actualTaskName, task);
}

}
