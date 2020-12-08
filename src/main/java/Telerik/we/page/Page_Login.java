package Telerik.we.page;

import org.openqa.selenium.By;

import Telerik.web.Initiate.InitiateDriver;
import Telerik.web.Utility.Utility;

public class Page_Login extends InitiateDriver {
	
	public static void youraccount_button()
	{
		Utility.clickelement(driver.findElement(By.id("js-tlrk-nav-not-auth-container")));
	}
	public static void username_password(String username, String password)
	{
		Utility.textboxelement(driver.findElement(By.id("username")), username);
		Utility.textboxelement(driver.findElement(By.id("password")), password);
		Utility.clickelement(driver.findElement(By.xpath("//button[text()='Log in']")));
		
	}
	

}
