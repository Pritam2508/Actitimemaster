package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addbtn;

	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement custmbtn;

	@FindBy(xpath = "//div[@class='customerNameDiv']/input")
	private WebElement cstmrNametbx;

	@FindBy(css = "[placeholder='Enter Customer Description']")
	private WebElement cstmrdcrptbx;
	
	@FindBy(xpath = "//span[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer']")
	private WebElement clickonDD;
	

	@FindBy(xpath = "//div[@class='comboboxButton focused']//input")
	private WebElement typecompany;

	@FindBy(xpath = "//span[contains(text(),'Our')]")
	private WebElement optndrpdwn;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement crtcusbtn;
	
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualcustName;
	
	@FindBy(id = "customerLightBox_content")
	private WebElement popwindow;
	
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement projectIcon;
	
	@FindBy(css = ".projectNameField")
	private WebElement projectName;
	
	@FindBy (xpath = "//div[@class='customerContainer']/div[2]")
	private WebElement customerDD;
	
	@FindBy (xpath = "(//div[@class='customerContainer']//input)[1]")
	private WebElement typeCustomer;
	
	@FindBy(xpath = "//span[contains(text(),'HDFC')]")
	private WebElement optprojectcustName;
	
	
	@FindBy(xpath = "//div[@class='projectDescriptionField']//textarea[@class='textarea']")
	private WebElement projectDescription;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement taskName;
	
	@FindBy(xpath = "//div[text()='Create Project']")
	private WebElement createprojectbutton;
	
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualProjectName;

	@FindBy(id = "createProjectPopup")
	private WebElement projectPopup;
	
	@FindBy(xpath = "//div[text()='+ New Tasks']")
	private WebElement newTaskIcon;
	
	@FindBy(xpath = "//tr[@class='selectCustomerRow']//div[@class='selectedItem']")
	private WebElement clickTaskCustomerDD;
	
	@FindBy(xpath = "(//tr[@class='selectCustomerRow']//input)[1]")
	private WebElement typeTaskCustomerName;
	
	@FindBy(xpath = "//span[text()='HDFC']")
	private WebElement selectTaskCustomerName;
	
	@FindBy(xpath = "//div[text()='- Select Project -']")
	private WebElement clickTaskProjectDD;
	
	@FindBy(xpath = "//tr[@class='selectProjectRow projectSelectorRow']//input")
	private WebElement typeTaskProjectName;
	
	@FindBy(xpath = "//span[text()='Personal']")
	private WebElement selectTaskProjectName;
	
	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement typeTaskTaskName;
	
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createTaskbutton;
	
	@FindBy(id = "createTasksPopup_content")
	private WebElement taskPopup;
	
	@FindBy(xpath = "(//div[@class='namesCell_taskManagement']/div[1])[1]")
	private WebElement actualTaskName;
	
	public WebElement getActualcustName() {
		return actualcustName;
	}


	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getCustmbtn() {
		return custmbtn;
	}

	public WebElement getCstmrNametbx() {
		return cstmrNametbx;
	}

	public WebElement getCstmrdcrptbx() {
		return cstmrdcrptbx;
	}

	public WebElement getclickOnDropDown() {
		return clickonDD;
	}
	
	public WebElement getOptndrpdwn() {
		return optndrpdwn;
	}

	public WebElement getCrtcusbtn() {
		return crtcusbtn;
	}
	
	public void setTypeCompany() throws InterruptedException {
		typecompany.sendKeys("Our company");
	}
	public WebElement getOptionDropdown() {
	return	optndrpdwn;
	}
	
	public WebElement getPopupWindow() {
		return	popwindow;
	}


	public WebElement getProjectIcon() {
		return projectIcon;
	}
	
	


	public WebElement getProjectName() {
		return projectName;
	}


	public WebElement getCustomerDD() {
		return customerDD;
	}


	public WebElement getTypeCustomer() {
		return typeCustomer;
	}


	public WebElement getProjectcustName() {
		return optprojectcustName;
	}


	public WebElement getTypecompany() {
		return typecompany;
	}


	public WebElement getOptprojectcustName() {
		return optprojectcustName;
	}


	public WebElement getProjectDescription() {
		return projectDescription;
	}


	public WebElement getTaskName() {
		return taskName;
	}


	public WebElement getCreateprojectbutton() {
		return createprojectbutton;
	}


	public WebElement getActualProjectName() {
		return actualProjectName;
	}
	
	public WebElement getProjectPopup() {
		return projectPopup;
	}


	public WebElement getNewTaskIcon() {
		return newTaskIcon;
	}


	public WebElement getClickTaskCustomerDD() {
		return clickTaskCustomerDD;
	}


	public WebElement getTypeTaskCustomerName() {
		return typeTaskCustomerName;
	}


	public WebElement getSelectTaskCustomerName() {
		return selectTaskCustomerName;
	}


	public WebElement getClickTaskProjectDD() {
		return clickTaskProjectDD;
	}


	public WebElement getTypeTaskProjectName() {
		return typeTaskProjectName;
	}


	public WebElement getSelectTaskProjectName() {
		return selectTaskProjectName;
	}


	public WebElement getTypeTaskTaskName() {
		return typeTaskTaskName;
	}


	public WebElement getCreateTaskbutton() {
		return createTaskbutton;
	}


	public WebElement getTaskPopup() {
		return taskPopup;
	}


	public WebElement getActualTaskName() {
		return actualTaskName;
	}
	
	
}
