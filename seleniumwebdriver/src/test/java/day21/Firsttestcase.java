package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Firsttestcase {

	public static void main(String[] args) {
		
		//launch browser(chrome)
		// ChromeDriver driver=new ChromeDriver();
		 WebDriver driver=new ChromeDriver();
	
		//open url https://demo.opencart.com/
		 driver.get("https://demo.opencart.com/");
		 
		 //validation store will "Just a moment..."
		 
		 String act_title=driver.getTitle();
		 
		 if(act_title.equals("Just a moment...")) 
		 {
			 System.out.println("Test passed");
		 }
		 else 
		 {
			 System.out.println("Test failed");
		 }
		 
		 //close browser
		 //driver.close();
		 //driver.quit();
	}

}
