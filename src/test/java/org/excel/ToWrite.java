package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToWrite {
	
	public static void main(String[] args) throws IOException {
		
		File fi= new File("C:\\Users\\maran\\eclipse-workspace\\Aakash_cucumberProject\\Sheet\\Login.xlsx");
		Workbook wb= new XSSFWorkbook();
		Sheet sheet = wb.createSheet("Login");
		
		Row row1 = sheet.createRow(0);
		Row row2 = sheet.createRow(1);
		Row row3 = sheet.createRow(2);
		Row row4 = sheet.createRow(3);
		Row row5 = sheet.createRow(4);
		
		Cell cell1 = row1.createCell(0);
		Cell cell2 = row1.createCell(1);
		
		Cell cell3 = row2.createCell(0);
		Cell cell4 = row2.createCell(1);
		
		Cell cell5 = row3.createCell(0);
		Cell cell6 = row3.createCell(1);
		
		Cell cell7 = row4.createCell(0);
		Cell cell8 = row4.createCell(1);
		
		cell1.setCellValue("username");
		cell2.setCellValue("password");
		cell3.setCellValue("Aakash");
		cell4.setCellValue("O8K54X");
		
		
		
		FileOutputStream fout= new FileOutputStream(fi);
		wb.write(fout);
		System.out.println("To Write The Data In WorkBook");
	}

}
