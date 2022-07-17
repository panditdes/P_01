package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Collection {

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
		
		
		
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='_37M3Pb']"));
		
		
		for(WebElement a: elements)
		{
			
			System.out.println(a.getText());
		}
		
		
		for(WebElement a: elements)
		{
			
			System.out.println(a.getSize());
		}
		
		
		for(WebElement a: elements)
		{
			
			System.out.println(a.getTagName());
		}
		
		
		
		for(WebElement a: elements)
		{
			
			System.out.println(a.hashCode());
			
		}
		
		for(WebElement a: elements)
		{
			
			System.out.println(a.getAriaRole());
			
		}
		
		
		
	}

}
