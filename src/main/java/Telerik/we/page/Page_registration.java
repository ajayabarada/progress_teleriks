package Telerik.we.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Telerik.web.Initiate.InitiateDriver;
import Telerik.web.Utility.Utility;

public class Page_registration extends InitiateDriver {
	
	public static void youraccount_button()
	{
		Utility.clickelement(driver.findElement(By.xpath("//a[@title='Your Account']")));
	}
	
	/*public static void newaccount_button()
	{
		//Utility.scrolldown(driver.findElement(By.xpath("//div[@class='u-tac  Login-panel']/a")));
		//WebElement element = driver.findElement(By.xpath("//a[@href='#register']"));
		//Actions action=new Actions(driver);
		//action.click(element).build().perform();
	}*/
	public static void clicknewaccount()
	{
		WebElement element = driver.findElement(By.xpath("//a[@href='#register']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		executor.executeScript("arguments[0].click();", element);
		//Utility.clickelement(driver.findElement(By.xpath("//a[@href='#register']")));
	}
	public static void personal_info(String Email, String Firstname, String Lastname, String Company)
	{
		Utility.textboxelement(driver.findElement(By.className("js-reg-email")), Email);
		Utility.textboxelement(driver.findElement(By.id("GeneralContent_C067_ctl00_ctl00_tbFirstName")), Firstname);
		Utility.textboxelement(driver.findElement(By.id("GeneralContent_C067_ctl00_ctl00_tbLastName")), Lastname);
		Utility.textboxelement(driver.findElement(By.id("GeneralContent_C067_ctl00_ctl00_tbCompanyName")), Company);
	}
	public static void country(String value, String text) throws InterruptedException
	{
		Utility.dropdownelement(driver.findElement(By.id("GeneralContent_C067_ctl00_ctl00_ddlCountry")), value);
		Utility.textboxelement(driver.findElement(By.id("GeneralContent_C067_ctl00_ctl00_tbPhone")), text);
		Thread.sleep(5000);
		Utility.clickelement(driver.findElement(By.id("GeneralContent_C067_ctl00_ctl00_btnSubmit")));
	}

}
