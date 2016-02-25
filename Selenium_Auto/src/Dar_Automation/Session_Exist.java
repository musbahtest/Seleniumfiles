package Dar_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session_Exist {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUSBAH15\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("chrome-extension://fdmmgilgnpjigdojojpjoooidkmcomcm/index.html");
		Thread.sleep(2000);
		WebElement droplist=driver.findElement(By.cssSelector("input[id='request-method-selector']"));
		Thread.sleep(2000);
		droplist.sendKeys("POST");
	
	}

}
