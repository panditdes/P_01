//package javaScriptExecutor;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class JavaScriptExecutor_Utility {
//	
//	/*what is javascriptexector?
//	javascriptexector is an interface wich provides mechanism to execute javascript through selenium driver
//	
//	Actions we can perform using javascript executor
//	1.flashing an element                --->highlight/flash element
//	2.Drawing a border around the element
//	3.capture title of the page         --->driver.get alternative method
//	4.click in some element             
//	5.generate alert info
//	6.refreshing page  ---->driver.navigate.refresh alternate method
//	7.scrollinng page   */
//	
//	
//	//flasing method
//	public static void flash(WebElement element,WebDriver driver) 
//	{
//	JavascriptExecutor js = ((JavascriptExecutor)driver); //we have to casting driver into javascriptexecutor
//	
//	String bgcolur = element.getCssValue("backgroundColor"); //this method gives background color of element 
//	
//	for(int i=0; i<500; i++)             //here we changing background colur for this we create changecolur method this change background colur
//	{
//		changeColor("#000000",element,driver);
//		
//		changeColor(bgcolur,element,driver);
//	}
//	}
//
//	public static void changeColor(String color,WebElement element,WebDriver driver)
//	{
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].style.backgroundColor= '" +color+"'", element);
//		
//		try
//		{
//			Thread.sleep(20);
//		}
//		catch(InterruptedException e)
//		{
//			
//		}
//	}
//
//	//To draw the Border around the element
//	public static void drawBorder(WebElement element,WebDriver driver)
//	{
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].style.border= '3px solid black'", element); // colur is red,border is 3px we can just change the name it will work
//	}
//	
//	// for getting title
//	public static String GetTitleByJS(WebDriver driver)
//	{
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		String title = js.executeScript("return document.title;").toString();
//		return title;
//		
//	}
//	
//	//for clicking
//	public static void ClickElementByJS(WebElement element,WebDriver driver)
//	{
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", element); 
//		
//	}
//	
//	//for generate Alert 
//	public static void generateAlert(WebDriver driver,String message)
//	{
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("alert('"  + message +"')"); 
//		
//	}
//	
//	//to refreshing the page
//	public static void refreshBrowserByJS(WebDriver driver)
//	{
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("history.go(0)"); 
//		
//	}
//	
//	//scrolldown till particular element 
//	public static void ScrollingINToView(WebElement element,WebDriver driver)
//	{
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView(true);",element); 
//		
//	}
//	
//	//scrolldown till end of the page
//	public static void ScrollPageDown(WebDriver driver)
//	{
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
//		
//	}
//	
//}
