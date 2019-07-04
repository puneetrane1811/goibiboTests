package com.scripbox.goibibo.inputwrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.*;

import com.scripbox.goibibo.library.globalPaths;

public class excelParser {
	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	ArrayList<String> index;
	String filename;
		

	
public excelParser(int idx) {

				try {
					globalPaths path = new globalPaths(); //initializing an object of the globalPaths class.
					filename = path.getInput(); //getting the path to the input file.
					file = new FileInputStream(new File(filename)); //opening the input file using FileInputStream.
					workbook = new XSSFWorkbook(file); //getting the workbook instance for the input file
					sheet = workbook.getSheetAt(idx);
					
					index = new ArrayList<String>();
					
					//System.out.println(sheet.getRow(sheet.getFirstRowNum()).getLastCellNum());
					/*the purpose of this for loop is to create an array of column headers so that retrieving the corresponding column value later on 
					becomes easier.*/
					for(int indx = 0; indx<sheet.getRow(sheet.getFirstRowNum()).getLastCellNum(); indx++){
						
						index.add(sheet.getRow(sheet.getFirstRowNum()).getCell(indx).getStringCellValue());
						//System.out.println(sheet.getRow(sheet.getFirstRowNum()).getCell(indx).getStringCellValue());
						
					}
				}catch(IOException e) {
					e.printStackTrace();
				}
			}

public String getCellValueType(String field, int idx) {
	String val= "";
	if(sheet.getRow(idx).getCell(getColumnIndex(field)) == null) {
		return val;
		
	}
	
	switch(sheet.getRow(idx).getCell(getColumnIndex(field)).getCellType()) {
	case 0:
		//if the cell contains a numerical value
		int numVal = (int) sheet.getRow(idx).getCell(getColumnIndex(field)).getNumericCellValue();
		val = Integer.toString(numVal);
		break;
		
	case 1:
		//if the cell contains a string value
		val = sheet.getRow(idx).getCell(getColumnIndex(field)).getStringCellValue();
		break;
		
	case 3:
		//if the cell contains a null/blanks
		val = "";
		break;
		
	case 4:
		if(sheet.getRow(idx).getCell(getColumnIndex(field)).getBooleanCellValue())
			val = "TRUE";
		else 
			val = "FALSE";
	}
	
	return val;
}
public int getColumnIndex(String columnName) {

	return this.index.indexOf(columnName);
}

}
