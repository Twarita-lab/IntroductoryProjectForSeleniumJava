package basicsOfSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTwo_BasicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//The below line is not reqd from Selenium version 4
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\twari\\Repositories\\chromedriver-win64\\chromedriver.exe");
		
		//Opening an url in a new window
		driver.get("https://courses.rahulshettyacademy.com/");
		
		//Get Title of the page with Selenium's method and print with Java's method
		System.out.println("Title of the page is: "+driver.getTitle());
		
		//Get url of opened browser
		System.out.println("URl of the page is: "+driver.getCurrentUrl());
		
		//source of the last page loaded.
		System.out.println(driver.getPageSource());
	//Any 1 of the below methods can be used; But these preferably should not be used together
		
		//Closing current instance's current window of driver
		driver.close();
		
		//Closing current instance's all window of driver
		//driver.quit();
		
	}

}
