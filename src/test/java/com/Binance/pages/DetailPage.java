package com.Binance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailPage extends BasePageObjects{

    @FindBy(xpath = "(//*[local-name()='svg' and @class='css-3kwgah'])[8]")
    public WebElement closeButton;

    @FindBy(id = "header_login")
    public WebElement loginButton;

    public void clickCloseButtonOfPopUp(){
        wait(8);
        closeButton.click();

    }
    public void clickloginButton() {
        loginButton.click();
    }

}



