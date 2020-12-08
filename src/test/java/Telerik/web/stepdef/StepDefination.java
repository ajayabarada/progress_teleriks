package Telerik.web.stepdef;

import Telerik.we.page.Page_Login;
import Telerik.we.page.Page_registration;
import Telerik.web.Initiate.InitiateDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefination extends InitiateDriver {
	
	@Given("user open the application")
	public static void open_browser()
	{
		InitiateDriver.startbrowser();
	}
	@When("user click on the your account option")
	public static void your_account()
	{
		Page_registration.youraccount_button();
	}
	@And("user clickon create new account option")
	public static void new_account()
	{
		//Page_registration.newaccount_button();
		Page_registration.clicknewaccount();
	}
	@And("^user fill the personal info like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and company \"([^\"]*)\"$")
	public void personal_information(String Email, String Firstname, String Lastname, String Company)
	{
		Page_registration.personal_info(Email, Firstname, Lastname, Company);
	}
	@And("user select the country \"([^\"]*)\" and fill the phone number \"([^\"]*)\"")
	public static void country_phone(String Country, String Phone) throws InterruptedException
	{
		Page_registration.country(Country, Phone);
	}
	
	@Given("user click on your account button")
	public static void youraccount_button()
	{
		Page_Login.youraccount_button();
	}
	@When("user enters the Username \"([^\"]*)\" and Password \"([^\"]*)\" and click on login button")
	public static void username_password(String username, String password)
	{
		Page_Login.username_password(username, password);
	}
	

}
