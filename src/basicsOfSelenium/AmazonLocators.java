package basicsOfSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		System.out.println("Finding element by class name, where 2 classes exists for this element --> "+
					driver.findElement(By.className("nav-logo-link")).getText());
		System.out.println("Finding elements by Regex xpath "+driver.findElement(By.xpath("//span[contains(text(),'Update location')]")).getText());
		
		System.out.println("Finding element by css with class attribite "+driver.findElement(By.cssSelector("span.icp-nav-link-inner")).getTagName());
		
		System.out.println("Finding elemnt by css with id attribute "+driver.findElement(By.cssSelector("span[id*='accountList']")).getText());
		
		System.out.println("Finding element by css regex "+driver.findElement(By.cssSelector("span[id*='accountList']")).getText());
		
		System.out.println("Finding element by xpath with index "+driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute'][2]")).getText());

		System.out.println("Finding element by id "+driver.findElement(By.id("nav-cart")).getText());
		
		System.out.println("Finding element by xpath - traversing from parent to child "+driver.findElement(By.xpath("//a[@role='button']/span")).getText());
		
		System.out.println("Finding element with css Regex "+driver.findElement(By.cssSelector("a[href*='fresh']")).getTagName());
		
		System.out.println("Finding element with xpath Text "+driver.findElement(By.xpath("//span[text()='Fresh']")).getTagName());
		
		System.out.println("Loop finding element with nth child of css ");
		
		for(int i=2; i<13; i++) {
			WebElement menu = driver.findElement(By.cssSelector("div#nav-xshop a:nth-child("+i+")"));
			System.out.println(menu.getText());
		}
		
		System.out.println("Finding Element based on Link Text "+driver.findElement(By.linkText("Women's Clothing")).getText());
		
		System.out.println("xpath with parent to child AND following sibling "+driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/following-sibling::div")).getText());
		
		System.out.println("xpath with child to parent "+driver.findElement(By.xpath("//span[@class='nav-action-inner']/parent::a")).getText());
		
		System.out.println("xpath- Parent child relation -- where few steps have been jumped--"+
		driver.findElement(By.xpath("//div[@id='navbar']//a[@aria-label='Choose a language for shopping.']")).getText());
		
		WebElement SearchBox = driver.findElement(By.cssSelector("input.nav-input.nav-progressive-attribute"));
		SearchBox.sendKeys("Abc");
		System.out.println("Css with class, where multiple class is present -- is SearchBox locator input.nav-input.nav-progressive-attribute ");
		
		driver.quit();

	}

}
