package utils;

public class ExcelUtilsTest {

	public static void main(String[] args) {
		String excelPath = "./TestData/TestData.xlsx";
		String sheetName = "Sheet1";

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		excel.getRowCount();
		excel.getCellData(1,0);
	}
}
