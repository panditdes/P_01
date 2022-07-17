package selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Red_Bus {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();      //upcasting
			
			
			
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.redbus.in/"); //get.(string url):void-webdriverpackage selenium;

			
			
			driver.manage().window().maximize();      //for maximize the method
			
			driver.getTitle();
			
			
			
			driver.findElement(By.xpath("//div[@id='signin-block']")).click();
			
			
			
			driver.findElement(By.xpath("//li[@id='signInLink']")).click();      //div[@id='hc' and @class='hid-config-sign hide']
		
			WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
			
			driver.switchTo().frame(frame);
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Sign in with Google Button']")));    
			
			// first xpath here then in wait
			WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));//iframe[@title='sign in with Google Button']
			
			driver.switchTo().frame(frame1);
			
			
			driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
			
			
			driver.switchTo().window((String)new ArrayList<>(driver.getWindowHandles()).get(1));
	
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("deshpandepandit143@gmail.com");
	
			
	        driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
			
			
			
	}

}
