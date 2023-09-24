package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) {
		getRowCount();
	}

	public static void getRowCount() {

		try {
			String projectPath = System.getProperty("user.dir");
			System.out.println(projectPath);

			String excelPath = projectPath + "/TestData/TestData.xlsx";

			XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = workbook.getSheet("Sheet");

			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows :" +rowCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
