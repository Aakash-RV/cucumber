package org.pojo;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderId extends Baseclass{
	
	public OrderId() {
	PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement orderNo;
	
	@FindBy(id = "my_itinerary")
	private WebElement iternary;
	
	@FindBy(name = "logout")
	private WebElement logout;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getIternary() {
		return iternary;
	}

	public WebElement getLogout() {
		return logout;
	}
}
