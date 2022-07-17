package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

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
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;    //import from selenium
		
		js.executeScript("window.scrollBy(0,1200)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-700)");         //script key object args
		
		Thread.sleep(2000);
		
		//Scrolling to particular element
		
		
		WebElement aboutus = driver.findElement(By.xpath("//a[@class='_1arVWX']"));
		
		
		           
		
		js.executeScript("arguments[0].scrollIntoView(true)", aboutus);           //key
		
		aboutus.click();
		
		
		
		//get text();
		
		
		WebElement aboutus1 = driver.findElement(By.xpath("//a[@class='_1arVWX']"));
		
		
		String text = aboutus1.getText();
		
		System.out.println(text);
		
		
		
		
		
		//get attribute();
		
		WebElement aboutus2 = driver.findElement(By.xpath("//a[@class='_1arVWX']"));
		
		
		
		System.out.println(aboutus2.getAttribute("class"));
		

		
	}

}
