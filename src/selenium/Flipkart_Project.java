package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Project {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
        System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		driver.get("https://www.flipkart.com/"); //get.(string url):void-webdriverpackage selenium;

		Thread.sleep(2000);
		
		driver.manage().window().maximize();      //for maximize the method
		
		driver.getTitle();
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		element.sendKeys("deshpandepandit143@gmail.com");      //email enter
		
		
		
        Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.xpath("//input[@type='password']"));
		
		element1.sendKeys("Ponds@123");              //password enter
	
	
		
		Thread.sleep(2000);
	
        WebElement element2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		element2.click();              //submit
		
		Thread.sleep(2000);
		
        WebElement element3 = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]"));
		
		element3.click();              //clicking on mobile catagary
		
		Thread.sleep(10000);
		
        WebElement element4 = driver.findElement(By.xpath("//div[@class='_3YgSsQ']"));
		
		element4.click();              //clicking on mobile brand
		
		Thread.sleep(10000);
		
		WebElement element5= driver.findElement(By.xpath("//div[@class='_3pLy-c row']"));
		
		element5.click();
		
		String mainpage = driver.getWindowHandle();
		
		System.out.println(mainpage);
		
		
		  Set<String> setOfAddresses = driver.getWindowHandles();
	         
	         
	      List<String> listOfPopups = new ArrayList<>(setOfAddresses);
	      
	      int count =setOfAddresses.size();
		
	      

	         for (int i=1; i<count;i++)
	         {
	        	 driver.switchTo().window(listOfPopups.get(i));
	        	 
	        	 Thread.sleep(3000);
	        	 
	        	 System.out.println(driver.getTitle());
	        	 
	        	 
	        	 driver.findElement(By.xpath("//button[text() ='ADD TO CART']")).click();
	         }
		
	      
	      
	        // driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
	      
	      
	}   
}	
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
		//driver.switchTo().getWindowHandles();
		
		
		//Thread.sleep(5000);
		
		
		//driver.findElement(By.xpath("//button[text() ='ADD TO CART']")).click();
		
		// error in below to lines
		//driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		//driver.findElement(By.xpath("//li[@class='col col-6-12']"));
		
	
//		WebElement element = driver.findElement(By.xpath("//button[text()='✕']"));
//		
//		element.click();
//		
//		
//        WebElement element1 = driver.findElement(By.xpath("//input[@type='text']"));
//		
//		element1.sendKeys("samsung TV");
//		
//		
//        WebElement element2 = driver.findElement(By.xpath("//button[@type='submit']"));
//		
//		element2.click();
//		
		
		
		
		
		
		
		
		
		
		
	

