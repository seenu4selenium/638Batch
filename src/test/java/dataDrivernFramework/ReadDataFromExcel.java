package dataDrivernFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		// Find the path of Excel
		FileInputStream fi = new FileInputStream("./src/test/resources/testdata.xlsx");
		// workbook
		Workbook w = new XSSFWorkbook(fi);
		// sheet
		Sheet s = w.getSheet("Sheet1");
		// row
		Row r = s.getRow(13);
		// cell(column)
		Cell c = r.getCell(4);
		System.out.println(c);

	}

}
