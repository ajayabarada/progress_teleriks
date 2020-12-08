package Telerik.web.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Telerik.web.Initiate.InitiateDriver;

public class Utility extends InitiateDriver {
	
	public static void clickelement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static void textboxelement(WebElement element,String text)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}
	
	public static void dropdownelement(WebElement element, String value)
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select=new Select(element);
		select.selectByValue(value);	
	}
	public static void scrolldown(WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
	}

}
