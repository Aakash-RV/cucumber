package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String json) {
		
		
		File f= new File("C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Reports\\JvmReport");
		
		Configuration c= new Configuration(f, "Adactin Hotel");
		c.addClassifications("EmployeeName", "Aakash");
		c.addClassifications("Browser", "EdgeBrowser");
		c.addClassifications("OS", "Windows");
		
		List<String> l= new ArrayList<String>();
		l.add(json);
		
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();
		
	}
	
	public static void main(String[] args) {
		
		generateJvmReport("C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Reports\\JsonReport\\adactin.json");
		
	}

}
