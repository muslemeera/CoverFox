package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelExample1 {

	public static void main(String[] args) throws IOException {
		FileInputStream myFiles = new FileInputStream("E:\\CoverFox\\CoverFoxTest.xlsx");
String value = WorkbookFactory.create(myFiles).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
System.out.println(value);
	}

}