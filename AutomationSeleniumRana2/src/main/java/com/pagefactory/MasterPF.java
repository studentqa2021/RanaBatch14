package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPF {
	public MasterPF(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[contains(text(),'Sign in')]")
	private WebElement SignIn;

	@FindBy(xpath = "(//*[contains(@id,'email')])[2]")
	private WebElement email;

	@FindBy(xpath = "//*[@id='passwd']")
	private WebElement password;

	@FindBy(xpath = "//*[@id='SubmitLogin']")

	private WebElement Submit;

	@FindBy(xpath = "//*[@class='logout']")
	private WebElement Signout;

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getSignout() {
		return Signout;
	}

}