package org.adactincucumberhookpojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinCucumberHookPOJOClass extends BaseClass {
	 public AdactinCucumberHookPOJOClass() {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(id="username")
	  private WebElement txtUserName;
	 
	@FindBy(id="password")
	  private WebElement txtPassWord;
	 
	 @FindBy(id="login")
	  private WebElement clkBtnLogin;
	 
	 public WebElement getTxtUserName() {
			return txtUserName;
		}

		public WebElement getTxtPassWord() {
			return txtPassWord;
		}

		public WebElement getClkBtnLogin() {
			return clkBtnLogin;
		}

}
