package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Drop_Down {
                           
	

	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	    System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		driver.get("https://www.facebook.com/"); //get.(string url):void-webdriverpackage selenium;

		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		WebElement signupbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		signupbtn.click();
		
		Thread.sleep(5000);
		
		
    	WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    	username.sendKeys("mohan");
    	
    	
    	
    	WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
    	surname.sendKeys("vadewala");
    	
    	WebElement moboremil = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
    	moboremil.sendKeys("12345@gmail.com");
    	
    	
    	WebElement Remoboremil = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
    	Remoboremil.sendKeys("12345@gmail.com");
    	
    	
    	WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
    	pass.sendKeys("vada");
    	
    	
    	
    	
		
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select sel1 = new Select(dropDown1);       //object of select class
		
		
		sel1.selectByIndex(27);                //---------(it gives one more if we take 17 then gives 18)
		
		Thread.sleep(2000);
	
		
		sel1.selectByValue("15");      //if you enter 15 gives 15       
		
		Thread.sleep(2000);
		
		sel1.selectByVisibleText("3");      //===it will same as entered
		
		Thread.sleep(2000);
		
		
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel2 = new Select(dropDown2);
		
		

		sel2.selectByIndex(5);                //---------(it gives one more if we take 17 then gives 18)
		
		Thread.sleep(2000);
	
		
		sel2.selectByValue("1");      //if you enter 15 gives 15       
		
		Thread.sleep(2000);
		
		sel2.selectByVisibleText("Dec");      //===it will same as entered
		
		Thread.sleep(2000);
		
		
		
		WebElement dropDown3 = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select sel3 = new Select(dropDown3);
		
		

		sel3.selectByIndex(27);                //---------(it gives one more if we take 17 then gives 18)
		
		Thread.sleep(2000);
	
		
		sel3.selectByValue("1947");      //if you enter 15 gives 15       
		
		Thread.sleep(2000);
		
		sel3.selectByVisibleText("1993");      //===it will same as entered
		
		Thread.sleep(2000);
		
		
		
		WebElement Radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
    	Radio.click();
    	
		
    	
//    	WebElement Submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//    	Submit.click();
//		
//    	Thread.sleep(20000);
//    	
//    	Thread.sleep(20000);
    	
    	Thread.sleep(5000);
    	
	    
    	
    	
    	
    	//Taking ScreenShot
    	
    	
    	SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
    	
    	
    	String date = formate.format(new Date());       //from java import date
    	
    	System.out.println(date);
    	
    	
    	
    	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	
    	File Destination = new File("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\Screenshots\\"+date+".jpg");
    	
    	
    	FileHandler.copy(source, Destination);           //IOException add kara
    	
    	
    	
    	

	}

}
