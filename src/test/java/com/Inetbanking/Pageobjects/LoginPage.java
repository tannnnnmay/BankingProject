package com.Inetbanking.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver ldriver;
	
	 public LoginPage(WebDriver rdriver){
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
		}
       @FindBy(name ="uid")
       WebElement txt_Username;
       
       @FindBy(name ="password")
       WebElement txt_Password;
       
       @FindBy(name ="btnLogin")
       WebElement btn_Login;
       
       public void setUsername(String uname)
       {
    	   txt_Username.sendKeys(uname);
       }
       public void setPassword(String pass)
       {
    	   txt_Password.sendKeys(pass);
       }
       
       public void clickSubmit()
       {
    	   btn_Login.click();
       }
}
