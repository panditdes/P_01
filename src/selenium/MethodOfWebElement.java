package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





                          //isselected and isDisplay and isEnabled method

public class MethodOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
        System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();      //upcasting
		
		
		
		
		//isEnabled method
		
		driver.get("https://www.makemytrip.com/"); //get.(string url):void-webdriverpackage selenium;

		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//li[@data-cy=\"account\"]"));
		
		
		element.click();
		
		
		Thread.sleep(2000);
		
		element.click();
		
		WebElement element1 = driver.findElement(By.xpath("//button[@data-cy='continueBtn']"));
		
		
		
		boolean k = element1.isEnabled();
		
		if(k)
		{
		System.out.println("Button is Enabled");	
		}
		
		else {
			
			System.out.println("Button is disabled");
		}
		
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("985451625");
		
		
		Thread.sleep(2000);
		
		
		
		boolean kk = element1.isEnabled();
		
		System.out.println(kk);
		
		
		
		//isselected and isDisplay
		
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		Thread.sleep(4000);
		
		//isSelected
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		checkbox.click();
		
		Thread.sleep(2000);
		
		
		boolean p = checkbox.isSelected();
		
		
		if(p)
		{
		System.out.println("checkbox is already selected");	
			
		}
		
		else
		{
			checkbox.click();
			
			System.out.println("checkbox selected");
			
		}
		
		
		//IsDisplayed
		
		
		
		WebElement text=driver.findElement(By.xpath("//h2[@class='Heading2']"));
		
		
		
		if(text.isDisplayed())
		{
			System.out.println("text is Displayed");
		}
		
		else
		{
			System.out.println("text is not Displayed");
		}
		
		
		
		
		
		
		
	}

}
