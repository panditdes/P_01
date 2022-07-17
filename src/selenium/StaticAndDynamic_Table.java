package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface StaticAndDynamic_Table {


	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();      //upcasting

		driver.get("https://www.demo.guru99.com/test/web-table-element.php#/"); //get.(string url):void-webdriverpackage selenium;



		driver.manage().window().maximize();      //for maximize the method


		//calculate the number of columns

		List<WebElement> columnElements = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));


		System.out.print(columnElements.size());

		//calculate the number of rows

		List<WebElement> rowElements = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));


		System.out.print(rowElements.size());


		for(WebElement k :columnElements)
		{
			System.out.print(k.getText() +"   ");
		}

		System.out.println();


		List<WebElement> cell = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//td"));

		int count = 0;

		for(WebElement k :cell)
		{
			System.out.print(k.getText() +"   ");

			count++;

			if(count == 5)
			{
				System.out.println();

				count = 0;
			}
		}

		FileInputStream file = new FileInputStream("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\My_Excel\\XL-Sheet\\Book1.xlsx");

		Sheet sheet = WorkbookFactory.create(file).getSheet("sheet3");    //take create boolean 


		for(int i=0; i<=5;i++)
		{
			try {
				String k = driver.findElement(By.xpath("//a[contains(text(),'Capital First')]/parent::td/parent::tr")).getText();
				System.out.println(k);
			}
			catch(NoSuchElementException e) 
			{
				int count1 = 0;
				for(WebElement k:cell)
				{
					System.out.println(k.getText()+"   ");
					count1++;
					if(count1 == 5)
					{
						System.out.println();

						count1=0;
					}
				}
			}

		}


		//	FileInputStream file = new FileInputStream("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\My_Excel\\XL-Sheet\\Book1.xlsx");
		//	
		//	Sheet sheet = WorkbookFactory.create(file).getSheet("sheet3");    //take create boolean 
		//	
		//	
		//	for(int i=0; i<=5;i++)
		//	{
		//		try {
		//			String k = driver.findElement(By.xpath("//a[contains(text(),+sheet.)"))
		//					System.out.println(k);
		//		}
		//		catch(NoSuchElementException e) 
		//		{
		//			int count = 0;
		//			for(WebElement k:cell)
		//			{
		//				System.out.println(k.getText()+"   ");
		//				count++;
		//				if(count == 5)
		//				{
		//					System.out.println();
		//					
		//					count=0;
		//				}
		//			}
		//		}
		//		
		//	}
		//	


	}	



}
