package org.step;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.helper.Baseclass;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPage;
import org.pojo.SelectHotel;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseclass{
	
	@When("user have to pass the valid username and valid password and click the login button")
	public void userHaveToPassTheValidUsernameAndValidPasswordAndClickTheLoginButton(io.cucumber.datatable.DataTable d) {
	    List<String> list = d.asList();
	    LoginPage l= new LoginPage();
	    sendKeys(l.getUsername(), list.get(0));
	    sendKeys(l.getPassword(), list.get(1));
	    click(l.getLogin());
		
	}
	@Then("User have to validate the login")
	public void userHaveToValidateTheLogin() {
	    
		String url = getDriver().getCurrentUrl();
		assertEquals(url, "https://adactinhotelapp.com/SearchHotel.php", "Url is invalid");
	}
	
	
	@When("user have to pass the Invalid username and valid password and click the login button")
	public void userHaveToPassTheInvalidUsernameAndValidPasswordAndClickTheLoginButton(io.cucumber.datatable.DataTable d) {
	    
		List<List<String>> lists = d.asLists();
		List<String> list = lists.get(1);
		LoginPage l= new LoginPage();
		sendKeys(l.getUsername(), list.get(0));
		sendKeys(l.getPassword(), list.get(1));
		click(l.getLogin());
		
	}
	@When("User have to verify login page")
	public void userHaveToVerifyLoginPage() {
	  
		String url = getDriver().getCurrentUrl();
		assertEquals(url, "https://adactinhotelapp.com/SearchHotel.php", "Url is invalid");
		if (url.contains("SearchHotel.php")) {
			
			System.out.println("Url is valid");
			
		}
	
	}
	
	@When("user have to pass the valid username and Invalid password and click the login button")
	public void userHaveToPassTheValidUsernameAndInvalidPasswordAndClickTheLoginButton(io.cucumber.datatable.DataTable d) {
	    
		Map<String, String> map = d.asMap();
		LoginPage l= new LoginPage();
		sendKeys(l.getUsername(), map.get("username"));
		sendKeys(l.getPassword(), map.get("password"));
		click(l.getLogin());
		
	}
	
	@Given("User have to validate the url of the login page")
	public void userHaveToValidateTheUrlOfTheLoginPage() {
	    
		String expectedUrl = "https://adactinhotelapp.com/";
		String url = getDriver().getCurrentUrl();
		assertEquals(url, expectedUrl);
		System.out.println("ExpectedUrl is Validated");
	}
	
	
	
	@Then("User have to validate the login page")
	public void userHaveToValidateTheLoginPage() {
		
		String url = getDriver().getCurrentUrl();
		assertEquals(url, url.contains("SearchHotel"));
		System.out.println("Url is not found");
	}
	
	@When("user have to pass the Invalid username and Invalid password and click the login button")
	public void userHaveToPassTheInvalidUsernameAndInvalidPasswordAndClickTheLoginButton(io.cucumber.datatable.DataTable d) {
		
		List<Map<String, String>> maps = d.asMaps();
		Map<String, String> map = maps.get(1);
		LoginPage l= new LoginPage();
		sendKeys(l.getUsername(), map.get("username"));
		sendKeys(l.getPassword(), map.get("password"));
		click(l.getLogin());
	}
	
	@Then("User have to verify the dashboard")
	public void userHaveToVerifyTheDashboard() {
		
		String expectedUrl= "https://adactinhotelapp.com/SearchHotel.php";
		String url = getDriver().getCurrentUrl();
		assertEquals(url, expectedUrl);
	}
	
	
	@Given("User have to pass to check the dashboard")
	public void userHaveToPassToCheckTheDashboard() {
	    
		String expectedUrl= "https://adactinhotelapp.com/SearchHotel.php";
		String url = getDriver().getCurrentUrl();
		assertEquals(url, expectedUrl);
		
	}
	@When("user have to pass the {string} and {string} and click the login button")
	public void userHaveToPassTheAndAndClickTheLoginButton(String user, String pwd) {
	   
		LoginPage l= new LoginPage();
		sendKeys(l.getUsername(), user);
		sendKeys(l.getPassword(), pwd);
		click(l.getLogin());
		
	}
	@When("User have to search the hotel and click search")
	public void userHaveToSearchTheHotelAndClickSearch() {
	    
org.pojo.SearchHotel sh= new org.pojo.SearchHotel();
		
		WebElement location = sh.getLocation();
		selectByValue(location, "London");
		
		WebElement hotels = sh.getHotels();
		selectByValue(hotels, "Hotel Sunshine");
		
		WebElement roomtype = sh.getRoomtype();
		selectByValue(roomtype, "Deluxe");
		
		WebElement rooms = sh.getRooms();
		selectByIndex(rooms, 2);
		
		sendKeys(sh.getCheckin(), "03/09/2026");
		sendKeys(sh.getCheckout(), "06/09/2026");
		
		WebElement adult = sh.getAdult();
		selectByIndex(adult, 1);
		
		WebElement child = sh.getChild();
		selectByIndex(child, 1);
		
		click(sh.getSearch());
	}
	
	@When("User have to select the hotel and click continue")
	public void userHaveToSelectTheHotelAndClickContinue() {
	    
		SelectHotel s= new SelectHotel();
		WebElement radiobtn = s.getRadiobtn();
		Assert.assertTrue(radiobtn.isEnabled(), "Case gets failed");
		click(radiobtn);
		
		click(s.getCntbtn());
	}
	@When("User have to fill the required details and click book")
	public void userHaveToFillTheRequiredDetailsAndClickBook() {
	    
org.pojo.BookHotel bh= new org.pojo.BookHotel();
		
		sendKeys(bh.getfName(), "Aakash");
		sendKeys(bh.getlName(), "R");
		sendKeys(bh.getAddress(), "chennai");
		sendKeys(bh.getCcn(), "6666985302103577");
		
		selectByIndex(bh.getCct(), 3);
		selectByIndex(bh.getMonth(), 11);
		selectByIndex(bh.getYear(), 20);
		
		sendKeys(bh.getCvv(), "111");
		click(bh.getBook());
	}
	@When("User have to generate the orderId")
	public void userHaveToGenerateTheOrderId() {
	   
		implicitWait(8);
		
		org.pojo.OrderId o= new org.pojo.OrderId();
		WebElement orderNo = o.getOrderNo();
		
		System.out.println("OrderNO:"+getAttribute(orderNo, "value"));
	}

	
	
}
