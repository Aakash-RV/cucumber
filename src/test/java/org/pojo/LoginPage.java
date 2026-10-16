package org.pojo;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass{
	
	public LoginPage() {
	PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBys({
	@FindBy(xpath = "//input[@id='password']"),
	@FindBy(xpath = "//input[@id='password']")
	})
	private WebElement password;
	
	@FindBy(xpath = "//a[text()='Forgot Password?']")
	private WebElement frgpwd;
	
	@FindBy(id = "login")
	private WebElement login;
	
	@FindBy(xpath = "//a[contains(text(),'User ')]")
	private WebElement newuser;
	
	@FindBy(xpath = "//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement invalid;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getFrgpwd() {
		return frgpwd;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getNewuser() {
		return newuser;
	}

	public WebElement getInvalid() {
		return invalid;
	}

	
	
	

}
