package selenium;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Table {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		

		//Dynamic Web Table with Pagination 
		
		
		    System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();      //upcasting

			
		
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    
		    driver.get("https://demo.opencart.com/admin/index.php"); //get.(string url):void-webdriverpackage selenium;
		    
		    driver.manage().window().maximize();      //for maximize the method
		
		    //Login
		
		    WebElement username=driver.findElement(By.id("input-username"));
		    
		    username.clear();
		    
		    username.sendKeys("demo");
		    
            WebElement password=driver.findElement(By.id("input-password"));
		    
            password.clear();
		    
            password.sendKeys("demo"); 
            
            driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
            driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();		//click on sale
            
            driver.findElement(By.xpath("//*[@id=\"collapse26\"]/li[1]/a")).click();	//click on order
            
            
            //Table 
            
            //1)Find Total Number Of Pages in table
            
            String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
            
            System.out.println(text); //Showing 1 to 20 of 12546 (628 Pages) we need only (628 Pages)

            int total_Pages = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1)); 
            //gives into string formate so integer of convert everything into integer and int total_pages store
            
            System.out.println("Total Number Of Pages:" +total_Pages);
            
            for(int p=1;p<=10;p++)     //total_Pages
            {
            	WebElement activepage = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
            	
            	System.out.println("Active Page:"+activepage.getText());
            	
            	activepage.click();
            	
            	int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
            	
            	System.out.println("Number Of Rows:"+rows);
            	
            	
            	//3)Read All Row From Each Page
            	
            	for(int r=1; r<=rows;r++)
            	{
            		String OrderId = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
            		
            		String CustomerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();  
            		
            		String Status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
            		
            		System.out.println(OrderId+"          "+CustomerName+"               "+Status);
            	}
            	
            }
            
            
            
            
            
            
            
            
            
            
            
	}

}
