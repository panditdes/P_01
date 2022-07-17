package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class X_Path_Using_Axes {


	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
        System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		driver.get("https://www.flipkart.com/"); //get.(string url):void-webdriverpackage selenium;

		
		
		driver.manage().window().maximize();      //for maximize the method
		
		driver.getTitle();
		
		
		WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		element.sendKeys("deshpandepandit143@gmail.com");      //email enter
		
		
		
       
		
		WebElement element1 = driver.findElement(By.xpath("//input[@type='password']"));
		
		element1.sendKeys("Ponds@123");              //password enter
	
	
		
		
	
        WebElement element2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		element2.click();              //submit
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		//Move to element
		
		Actions act = new Actions(driver);
		
		
		act.moveToElement(ele).perform();
		
		
		
		FileInputStream file = new FileInputStream("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\My_Excel\\XL-Sheet\\Book1.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("sheet2");    //take create boolean 
	
		List<String> listformsheetInString =new ArrayList<>();
		
		
		for(int i=1;i<2;i++)
		{
			listformsheetInString.add(sheet.getRow(i).getCell(1).getStringCellValue());
			      //row and cell both follow index
			
			//System.out.println(value);
		}
		
	
		
		List<WebElement> listfromsite = driver.findElements(By.xpath("//div[text()='Electronics']"
				+ "/parent::div/following-sibling::div//div/following-sibling::div/div/div"));
		                                                              
		List<String> listfirmsiteString =new ArrayList<>();
		
		
		for(int i=0; i<listfromsite.size();i++)
		{
			//System.out.println(listfromsite.get(i).getText());
			
			listfirmsiteString.add(listfromsite.get(i).getText());
			
		}
		
		System.out.println(listfirmsiteString);
		
		  
		if(listfirmsiteString.equals(listformsheetInString))
		{
			System.out.println("TEST PASSED");
			
		}
			
		else
		{
			System.out.println("TEST FAILS");
		}
			
		
	}

}
