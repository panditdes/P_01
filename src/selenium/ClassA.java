package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		driver.get("https://www.flipkart.com/"); //get.(string url):void-webdriver
		
		driver.manage().window().maximize();   //method chaining
		
		
		//driver.manage().window().minimize();
		
		String  k = driver.getCurrentUrl();
		
		System.out.println(k);
		
		String kk = driver.getTitle();
		
		System.out.println(kk);
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
	}

}
