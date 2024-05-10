package day22;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocatorsDemo {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//Boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplaystatus);
		
		//linktext &partiallinktext
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tab")).click();
		
		//class
		//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("total number of header links:"+headerLinks.size());
		
		//tagname
		//List<WebElement>links=driver.findElements(By.tagName("a"));
		//System.out.println("total no of links:"+links.size());
		
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("total no of images:"+images.size());
		
		
		
		
	}

}
