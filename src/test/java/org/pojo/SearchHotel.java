package org.pojo;

import java.awt.print.PageFormat;

import org.helper.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Baseclass{
	
	public SearchHotel() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBys({
		@FindBy(xpath = "//select[@class='search_combobox']"),
		@FindBy(xpath = "//select[@class='search_combobox']")
	})
	private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath= "//select[@id='room_nos']")
	private WebElement rooms;
	
	@FindBy(xpath = "//input[@class='date_pick']")
	private WebElement checkin;
	
	@FindBy(xpath = "//input[@class='date_pick']")
	private WebElement checkout;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	@FindBy(id = "Reset")
	private WebElement reset;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}
	
	

}
