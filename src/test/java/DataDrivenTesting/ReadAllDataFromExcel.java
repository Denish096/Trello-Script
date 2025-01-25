package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadAllDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/DataDrivenTesting.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet2");
		List<String> ExpectedDayList = new ArrayList<String>();
		List<String> ExpectedMonthList = new ArrayList<String>();
		List<String> ExpectedyearList = new ArrayList<String>();
		//		// getFirstRowNum () will give the first number of the row in form of index.
		//		int rowFirst = sheet.getFirstRowNum();
		//		System.out.println(rowFirst);
		//		// getLastRowNum () will give the Last number of the row in form of index.
		//		int rowLast = sheet.getLastRowNum();
		//		System.out.println(rowLast);
		//		Row row = sheet.getRow(0);
		//		// getFirstCellNum() will give the First number of cell in form of index.
		//		short cellfirst = sheet.getRow(rowFirst).getFirstCellNum();
		//		System.out.println(cellfirst);
		//		// getLastCellNum() will give the Last number of cell in form of index.
		//		short cellLast = sheet.getRow(rowLast).getLastCellNum();
		//		Cell cell = row.getCell(2);
		//		System.out.println(cell);
		//		System.out.println(cellLast);
		int FirstRowIndex = sheet.getFirstRowNum();
		int LastRowIndex = sheet.getLastRowNum();
		for(int i=FirstRowIndex ;i<=LastRowIndex;i++) {
			Row ConsideredRow = sheet.getRow(i);
			short FirstCellIndex = ConsideredRow.getFirstCellNum();
			short LastCellCount = ConsideredRow.getLastCellNum();
			for(int j = FirstCellIndex + 1;j<LastCellCount;j++) {
				CellType celltype = ConsideredRow.getCell(j).getCellType();
				if(String.valueOf(celltype).equals("STRING")) {
					String StringCellValue = ConsideredRow.getCell(j).getStringCellValue();
					if(i==1) {
						ExpectedMonthList.add(StringCellValue);
					}
//					System.out.println(StringCellValue);
				}
				else if (String.valueOf(celltype).equals("NUMERIC")) {
					int  StringCellValue = (int)ConsideredRow.getCell(j).getNumericCellValue();
					if(i==0) {
						ExpectedDayList.add(String.valueOf(StringCellValue));
					}
					else if (i==2) {
						ExpectedyearList.add(String.valueOf(StringCellValue));
					}
//					System.out.println(StringCellValue);
				}
			}
		}
		System.out.println(ExpectedDayList);
		System.out.println(ExpectedMonthList);
		System.out.println(ExpectedyearList);
		workbook.close();
	}
}

