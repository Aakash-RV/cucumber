package org.pojo;


import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Baseclass{
	
	public BookHotel() {
	PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement fName;
	
	@FindBy(id = "last_name")
	private WebElement lName;
	
	@FindBy(xpath = "//textarea[@class='txtarea']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccn;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cct;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(name = "book_now")
	private WebElement book;
	
	@FindBy(name = "cancel")
	private WebElement cancel;

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcn() {
		return ccn;
	}

	public WebElement getCct() {
		return cct;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
	
	

}
