package com.actitime.generic;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is Generic library to Read Data
 * @author Pritam Gupta
 *
 */
public class FileLib {
	/**
	 * This method is used to read Data from Property file
	 * @param key
	 * @return String
	 * @throws IOException
	 */

	public String getPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commonData.property");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	/**
	 * This method is used to read Data from Excel file
	 * @param SheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String getExcelData(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(SheetName);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String cv = c.getStringCellValue();
		return cv;
	}
/**
 * This method is used to write Data to excel file
 * @param SheetName
 * @param row
 * @param cell
 * @param data
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public void setExcelData(String SheetName, int row, int cell, String data)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(SheetName);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		c.setCellValue(data);

	}

}
