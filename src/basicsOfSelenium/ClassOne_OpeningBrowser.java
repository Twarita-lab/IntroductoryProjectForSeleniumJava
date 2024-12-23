package basicsOfSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassOne_OpeningBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		//For Chrome
		WebDriver driverC= new ChromeDriver();
		
		//For Firefox 
		WebDriver driverF = new FirefoxDriver();
		
		//For MSEdgeDriver
		WebDriver driverE = new EdgeDriver();
		
		//The below line is not reqd from Selenium version 4.6.0
		//System.setProperty("webDriver.chrome.driver", "C:\\Users\\twari\\Repositories\\chromedriver-win64\\chromedriver.exe");
		
	}

}
