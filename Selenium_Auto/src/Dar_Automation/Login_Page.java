package Dar_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import com.thoughtworks.selenium.webdriven.commands.GetText;

public class Login_Page {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://musbah.com/dar/index.php/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[3]/form/input[1]")).sendKeys("t1@bug.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[3]/form/input[2]")).sendKeys("123123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[3]/form/div[2]/input")).click();
		Thread.sleep(1000);
		System.out.println("Error message shown: "+driver.findElement(By.xpath("//*[@id='wrapper']/div[3]/form/div[1]")).getText());
	String text="SessionExist";
	String actualtext=driver.findElement(By.xpath("//*[@id='wrapper']/div[3]/form/div[1]")).getText();
	if(actualtext.equalsIgnoreCase(text))
	{
		Session_Exist ses=new Session_Exist();//the name of file which need to be executed next after executing this file"i.e, BackandFront.java"
		try {
			ses.main(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

}
