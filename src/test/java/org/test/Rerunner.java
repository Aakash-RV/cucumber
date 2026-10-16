package org.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "@C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Rerun\\rerun1.txt",
glue = "org.step", monochrome = true, dryRun = false, snippets = SnippetType.CAMELCASE, tags = "not @regression", plugin = {"pretty",
"html:C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Reports\\HtmlReport\\Adactin.html",
"junit:C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Reports\\Junit\\adactin.xml",
"json:C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Reports\\JsonReport\\adactin.json",
"rerun:C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Rerun\\rerun.txt"})

public class Rerunner extends AbstractTestNGCucumberTests{

}
