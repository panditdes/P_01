package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {

	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
			
			
			WebDriver driver1 = new ChromeDriver(); 
			
			driver1.get("https://www.filpkart.com/");
			
			
			driver1.manage();
			
			Thread.sleep(2000);
			
			
			driver1.manage().window().maximize();
			
			//Changing the size of the browser
			
			Dimension k = new Dimension(1300,1000);
			
			
			driver1.manage().window().setSize(k);

	}

}
