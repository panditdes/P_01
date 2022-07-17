package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


           

public class Child_Browser_popup {

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
		
		
		WebElement element3 = driver.findElement(By.xpath("//input[@class='_3704LK']")); //searching
		
		
		WebElement element4 = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));  //finding
		
        FileInputStream file = new FileInputStream("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\My_Excel\\XL-Sheet\\Book1.xlsx");
		
		//dont forget to add xlsx and import from java
		
		
		Sheet workbook = WorkbookFactory.create(file).getSheet("sheet1");    //take create boolean 
		
		
		 
		
		
		
		
		for(int i=1;i<=3;i++)
		{
			String k;
			
			try {
				
				k=workbook.getRow(i).getCell(1).getStringCellValue();      //row and cell both follow index
			
			}
			
			catch(Exception e)
			{
				int value =(int)workbook.getRow(i).getCell(1).getNumericCellValue();
				
				k = String.valueOf(value);
			}
		
			
			element3.sendKeys(k);
			
			Thread.sleep(5000);
			
			element4.click();
			
			Thread.sleep(5000);
			
			
			
		    driver.findElement(By.xpath("//a[@class='_1fQZEK']")).click();
			
			for (int j=1; j<=k.length();j++)
			{
				
				element3.sendKeys(Keys.BACK_SPACE);
			}
			
			
			Thread.sleep(3000);
			
		}
		
	         String mainPage=driver.getWindowHandle();
	         
	         System.out.println(mainPage);
	         
	         Set<String> setOfAddresses = driver.getWindowHandles();
	         
	         System.out.println(setOfAddresses);
	         
	         List<String> listOfPopups = new ArrayList<>(setOfAddresses);
	         
	         
	         int count =setOfAddresses.size();
	         
//	         driver.switchTo().window(CDwindow-6C67453ED604EDDCC1541FDE3A7FED80);
//	         
//	         driver.switchTo().window(CDwindow-6C67453ED604EDDCC1541FDE3A7FED80);
//	         
//	         driver.switchTo().window(CDwindow-A306AA24079749E74AFF7F2BCE1A66FB);
	         
	         
	         for (int i=1; i<count;i++)
	         {
	        	 driver.switchTo().window(listOfPopups.get(i));
	        	 
	        	 Thread.sleep(3000);
	        	 
	        	 System.out.println(driver.getTitle());
	        	 
	        	 
	        	 driver.findElement(By.xpath("//button[text() ='ADD TO CART']")).click();
	         }
		
		
		
	
		
	}

}
