package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
        System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		driver.get("https://demo.guru99.com/test/delete_customer.php"); //get.(string url):void-webdriverpackage selenium;
		
		
        Thread.sleep(2000);
		
		driver.manage().window().maximize();      //for maximize the method
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12345");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//Alert Popup will open
		
		
		Alert k = driver.switchTo().alert();
		
		
		if(k.getText().equals("Do you really want to delete this Customer?"))
		{
			System.out.println("Test Passed");
			
			Thread.sleep(3000);
			
			
			k.accept();
			
			
			Thread.sleep(3000);
			
			k.accept();
			
			Thread.sleep(3000);
			
			
			k.dismiss();
		
		}
		
		
		else
		{
			System.out.println("Test Fails");
			
			Thread.sleep(3000);
			
			k.dismiss();
		}
		
		
		
		
	}

}
