package com.info.trello.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * This method will help to read the String Data from Excel sheet.
	 * @param sheetname
	 * @author denish
	 * @param rowIndex
	 * @param cellIndex
	 * @return cell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readStringData(String sheetName, int rowIndex ,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trelloExcelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value ;
	}
	/**
	 * This method will help to read the Numeric Data from Excel sheet.
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return cell Value double
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double readNumericData(String sheetName, int rowIndex ,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trelloExcelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		double value = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
		return value ;
	}
}
