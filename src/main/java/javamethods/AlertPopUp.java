package javamethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.alertpopup;

public class AlertPopUp {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchborweser() throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(cr);
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector(".category-cards .card.mt-4:nth-child(3)")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		
		driver.findElement(By.cssSelector(".left-pannel .element-group:nth-child(3) .element-list.collapse li#item-1")).click();
	}
	
	
	
	@Test(priority = 1)
	public void Alertpopup() {
		driver.findElement(alertpopup.Alert_Button).click();
		driver.switchTo().alert().accept();
		
	}
	
	@Test(priority = 2)
	public void TimerAlert() throws InterruptedException {
		driver.findElement(alertpopup.Timer_Alert_Button).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
	}
	
	@Test(priority = 3)
	public void ConfirmAlert() {
		driver.findElement(alertpopup.Confirm_Alert).click();
		driver.switchTo().alert().dismiss();
		//OK = accept     Cancel=dismiss
		
	}
	
	@Test(priority = 4)
	public void PromptAlert() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		String text = "Aman";
		driver.findElement(alertpopup.Prompt_Button).click();
		driver.switchTo().alert().sendKeys(text);
		//driver.switchTo().alert().sendKeys("Aman"); direct enter text in field  
		driver.switchTo().alert().accept();
		
		String matchtext = driver.findElement(By.id("promptResult")).getText();
		if (matchtext.contains("Anshul")) {
			System.out.print("Text Verified");
		}
		else {
			System.out.print("Text does not match");
		}
	}

}
