package org.test;

import org.step.JvmReport;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\src\\test\\resources\\FeatureFile",
glue = "org.step", monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, plugin = {"pretty",
"html:C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Reports\\HtmlReport\\Adactin.html",
"junit:C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Reports\\Junit\\adactin.xml",
"json:C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Reports\\JsonReport\\adactin.json",
"rerun:C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Rerun\\rerun1.txt"})
public class RunnerClass extends AbstractTestNGCucumberTests{
 
//	@AfterClass
//	public void report() {
//		
//		JvmReport.generateJvmReport("C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Reports\\JsonReport\\adactin.json");
//	}
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
}
