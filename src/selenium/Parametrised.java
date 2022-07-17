package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parametrised {

	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
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
		
		
		WebElement element3 = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		
		
		WebElement element4 = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		
        FileInputStream file = new FileInputStream("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\My_Excel\\XL-Sheet\\Book1.xlsx");
		
		//dont forget to add xlsx and import from java
		
		
		Sheet s = WorkbookFactory.create(file).getSheet("sheet1");    //take create boolean 
	
		
		for(int i=1;i<=3;i++)
		{
			String value = s.getRow(i).getCell(1).getStringCellValue();      //row and cell both follow index
			
			element3.sendKeys(value);
			
			Thread.sleep(5000);
			
			element4.click();
			
			Thread.sleep(5000);
			
			
			for (int j=1; j<=value.length();j++)
			{
				
				element3.sendKeys(Keys.BACK_SPACE);
			}
		
			
		}
		
	
		
	}

}
