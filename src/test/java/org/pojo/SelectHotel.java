package org.pojo;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends Baseclass{

	public SelectHotel() {
	PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id = "continue")
	private WebElement cntbtn;
	
	@FindBy(id = "cancel")
	private WebElement cnlbtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getCntbtn() {
		return cntbtn;
	}

	public WebElement getCnlbtn() {
		return cnlbtn;
	}
	
	
}
