package src.com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Utility {
 
	WebDriver driver;
	
	@Test(dataProvider = "getData") //dataProvider value should be equal to @DataProvider method name
	public void doLogin(String text) throws InterruptedException 
	{ //no. of parameter = no. of columns

		System.setProperty("webdriver.chrome.driver","C://Automation//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(text);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(7000);
		driver.quit();
	}
}
