//package javaScriptExecutor;
//
////import java.io.File;
////import java.io.IOException;
////import org.apache.commons.io.FileUtils;
////import org.openqa.selenium.By;
////import org.openqa.selenium.OutputType;
////import org.openqa.selenium.TakesScreenshot;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
//
//public class JavaScriptExecutor_TestClass {
//
////	public static void main(String[] args) throws IOException  {
////		
////		  System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
////			
////		  WebDriver driver = new ChromeDriver();
////			
////		 driver.get("https://www.twoplugs.com");
////		 
////		 driver.manage().window().maximize();
////		 
//		 
//		             //Flashing Of Element
//		//WebElement JoinFree= driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));
//		
//		//JavaScriptExecutor_Utility.flash(JoinFree, driver);
//		
//		
//		             //Drawing the Border //bug-->screenshot-->border the defect & screenshot
//      
//		 //JavaScriptExecutor_Utility.drawBorder(JoinFree, driver);
//		 
//		 //File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //typecasting driver
//		// FileUtils.copyFile(src, new File("F:\\Pandit\\Required Document\\Selenium\\SELENIUM\\Screenshots.png"));
//		 
//		             // capture title of page--->driver.get  alternative for this
//		 
//		 //System.out.println(driver.getTitle());
//		 
//		String Title= JavaScriptExecutor_Utility.GetTitleByJS(driver);
//		System.out.println(Title);
//		 
//		
//		//sometimes click method not working then we use javascript util its working internally but we create click shortcut method
//		
//		//WebElement LogInBtn = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
//		//LogInBtn.click();
//		//JavaScriptExecutor_Utility.ClickElementByJS(LogInBtn, driver);
//		
//		
//		//Generate alert info  when we click on login button i have to generate we have click on longin button at run time i want to know
//		
//		//JavaScriptExecutor_Utility.generateAlert(driver, "You clicked on Login Button...");
//		
//		
//		//Refreshing Page
//		//driver.navigate().refresh();          //normally we use navigate internally do jsexecutor
//		//JavaScriptExecutor_Utility.refreshBrowserByJS(driver);
//		
//		//Scrooling down the page until find element
//		
//		//WebElement image = driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
//		//JavaScriptExecutor_Utility.ScrollingINToView(image, driver);
//		
//		//Scroll down page till end
//		JavaScriptExecutor_Utility.ScrollPageDown(driver);
//	}
//
//}
