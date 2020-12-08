package Telerik.web.Initiate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Telerik.web.property.Read_PropertyFIle;

public class InitiateDriver {
	
	public static WebDriver driver; 
	
	public static void startbrowser()
	{
		if(Read_PropertyFIle.readfile("Browser_name").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajay Barad\\Automation\\Progress_Teleriks\\src\\main\\resources\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get(Read_PropertyFIle.readfile("Application_URL").toString());
		driver.manage().window().maximize();
	}

}
