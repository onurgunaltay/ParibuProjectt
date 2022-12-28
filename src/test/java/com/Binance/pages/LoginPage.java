package com.Binance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObjects{

    @FindBy(id = "username")
    public WebElement email;

    @FindBy(id = "click_login_submit")
    public WebElement nextButton;

    public void loginWithInvalidCredentials(){
        String invalidEmail="invalidemail";
    email.sendKeys(invalidEmail);
    }
    public void clicknextButton () {
        nextButton.click();
    }


}
