package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		
        System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		driver.get("https://demo.guru99.com/selenium/newtours/"); //get.(string url):void-webdriverpackage selenium;

		driver.manage().window().maximize();      //for maximize the method
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a")); //all link of site
		
		System.out.println(links.size());        
		
		for(int i=0; i<links.size(); i++)
		{
			WebElement element = links.get(i);
			
			String url = element.getAttribute("href"); //by using href attribute we get requried url link
			
			URL link =new URL(url);          //creating object of URL class
			
			//creating a connection using url object "link"
			HttpURLConnection httpconnection = (HttpURLConnection) link.openConnection();
			
			Thread.sleep(2000);
		
			httpconnection.connect();       //Established Connection
			
			int responsecode = httpconnection.getResponseCode();   //getting Responsecode if above 400 then broken link
			
			if(responsecode>= 400)
			{
				System.out.println(url +" - "+" Is Broken Link");
			}
			
			else
			{
				System.out.println(url +" - "+" Is Valid Link");
			}
		}
		
		
		
		
		
		
		
	}
}
