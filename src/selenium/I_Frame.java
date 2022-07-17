package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class I_Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
       System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
        Thread.sleep(2000);
		
		driver.manage().window().maximize();      //for maximize the method
		
		
		WebElement Date = driver.findElement(By.xpath("//input[@id='start']"));
		
		Date.sendKeys("01/02/2018");
		
		Date.getText();
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframe_b']")));
		
		WebElement text1 =driver.findElement(By.xpath("//input[@id='searchInput']"));
		text1.sendKeys("English");
		
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.switchTo().defaultContent();
		
	   WebElement text = driver.findElement(By.xpath("//input[@id='email']"));
	    text.sendKeys("bsdvabipuh@gmail.com");
		
		System.out.println(text);
	}
	
}
		

          //Iframe using javatpoint
//      driver.get("https://www.javatpoint.com/oprweb/test.jsp?filename=htmliframe2"); //get.(string url):void-webdriverpackage selenium;		
//	    driver.findElement(By.xpath("//textarea[@id='textareaCode']")).sendKeys("<!DOCTYPE html><html><body><h2>HTML Iframes example</h2><p>Use the height and width attributes to specify the size of the iframe:</p><iframe src=\"https://www.javatpoint.com/\" height=\"300\" width=\"400\"></iframe></body></html>");
//		
//		
//		driver.findElement(By.xpath("//button[@onclick='runInfo()']")).click();
//		
//		Thread.sleep(20000);
//		
//		
//    	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframewrapper']")));
//		
//    	Thread.sleep(2000);
//    	
//    	
//    	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://www.javatpoint.com/']")));
//
//		
//    	Thread.sleep(2000);
//	
//    	driver.findElement(By.xpath("(//input[@name='search'])[2]")).sendKeys("Java T Point");
//    	
//    	
//    	driver.findElement(By.xpath("(//td[@class='gsc-search-button'])[2]")).click();
//    	
//    	
//    	System.out.println(driver.findElement(By.xpath("(//td[@class='gsc-search-button'])[2]")).getText());
//    	
//    	
//    	driver.switchTo().defaultContent();
//    	
//    	
//    	System.out.println(driver.findElement(By.xpath("//textarea[@id='textareaCode']")).getText());
//    	
//    	
//        driver.switchTo().parentFrame();
//    	
//			
//Thread.sleep(5000);
//List<WebElement> iframeList = driver.findElements(By.tagName("iframe"));
//int totalframe = iframeList.size();
//System.out.println("total. of total frame:" +totalframe);
//driver.close();
//
//	}
//
//}
