package datadrivenexample;

import org.testng.annotations.DataProvider;

public class DataForTests {
	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost() {

		Object[][] data = new Object[2][3];
		data[0][0] = "Pranav";
		data[0][1] = "Patil";
		data[0][2] = 2;

		data[1][0] = "Nitin";
		data[1][1] = "Gujju";
		data[1][2] = 1;
		return data;

	}
}
