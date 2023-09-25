package reporting;
 
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReporterManager {
	public static void createInstance(String fileName,String reportName, String documentTitle) {
		ExtentSparkReporter report = new ExtentSparkReporter(fileName);
		report.config().setReportName(reportName);
		report.config().setDocumentTitle(documentTitle);
	}
}
