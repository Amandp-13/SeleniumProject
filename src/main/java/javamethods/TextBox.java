package javamethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.textbox;

public class TextBox  {
	
	public static WebDriver driver;
	
		//public static void main(String args[]) 
	 
	
	@BeforeTest
		public void launchbrowser() throws InterruptedException{
			
			WebDriverManager.chromedriver().setup();
			ChromeOptions cr = new ChromeOptions();
			cr.addArguments("--remote-allow-origins=*");
			
			driver = new ChromeDriver(cr);
			// Find Element by CSS selector
			//driver.get("https://demoqa.com");
			//driver.manage().window().maximize();
			//driver.findElement(By.cssSelector(".category-cards .card.mt-4:nth-child(1)")).click();
			
			
			driver.get("https://demoqa.com/text-box");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().deleteAllCookies();
		}
	 @Test
	 public void handletextbox() throws InterruptedException  {
		 driver.findElement(textbox.Txt_Fullname).sendKeys("Amandeep Singh");
		 driver.findElement(textbox.Txt_Email).sendKeys("aman2311@gmail.com");
		 driver.findElement(textbox.Txt_CurrentAddress).sendKeys("Chandigarh");
		 driver.findElement(textbox.Txt_PermanentAddress).sendKeys("Chandigarh");
		 
		 //Browser Scoll Down/ Up
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", ""); // Scroll Down
		 driver.findElement(textbox.Btn_Submit).click();
		 Thread.sleep(2000); //used to wait
		 js.executeScript("window.scrollBy(0,-100)", ""); // Scroll Up
		
		 
	     System.out.println("passed");
		 driver.quit();
	 }
	}




