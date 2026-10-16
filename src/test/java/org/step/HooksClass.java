package org.step;

import java.io.IOException;

import org.helper.Baseclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends Baseclass{
	
	@Before()
	public void launch() {
		
		toLaunchEdge();
		getUrl("https://adactinhotelapp.com/");
		toMax();
	}
	
	
	@After()
	public void scrShot(Scenario s) throws IOException {
		
		if (s.isFailed()) {
			
			TakesScreenshot tk= (TakesScreenshot) getDriver();
			byte[] sc = tk.getScreenshotAs(OutputType.BYTES);
			s.attach(sc, "image.png", s.getName());
			
		}
		
		implicitWait(5);
		toQuit();
		
	}

}
