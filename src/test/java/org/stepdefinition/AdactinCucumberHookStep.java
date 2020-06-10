package org.stepdefinition;

import org.adactincucumberintergrationpojo.LogInPOJOClass;
import org.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AdactinCucumberHookStep  extends BaseClass{
	

	@Given("User is on Adactin Hotel Page")
	public void user_is_on_Adactin_Hotel_Page() {
		System.out.println("user is on the Adactin hotel page");
		launchBrowser();
	}

	@When("User Enters the {string} and {string}")
	public void user_Enters_the_and(String string, String string2) {
		launchUrl("http://adactin.com/HotelApp/index.php");
	    LogInPOJOClass l=new LogInPOJOClass ();
	    fill(l.getTxtUserName(), "samsamsam");
	    fill(l.getTxtPassWord(), "samsamsam");
	    
	}

	@When("User Clicks the Login button")
	public void user_Clicks_the_Login_button() {
		LogInPOJOClass l=new LogInPOJOClass ();
		btnClk(l.getClkBtnLogin());
	}
	

@When("User Enters the username and password")
public void user_Enters_the_username_and_password() {
	launchUrl("http://adactin.com/HotelApp/index.php");
    LogInPOJOClass l=new LogInPOJOClass ();
    fill(l.getTxtUserName(), "samsamsam1");
    fill(l.getTxtPassWord(), "samsamsam1");
}


@When("User should give the valid username and password")
public void user_should_give_the_valid_username_and_password() {
	launchUrl("http://adactin.com/HotelApp/index.php");
    LogInPOJOClass l=new LogInPOJOClass ();
    fill(l.getTxtUserName(), "samsams2am22");
    fill(l.getTxtPassWord(), "samsams2am");
}

@When("User  should give the invalid username and password")
public void user_should_give_the_invalid_username_and_password() {
	launchUrl("http://adactin.com/HotelApp/index.php");
    LogInPOJOClass l=new LogInPOJOClass ();
    fill(l.getTxtUserName(), "sams22eeeqwamsam");
    fill(l.getTxtPassWord(), "samewfwfsamsam");
}
}
