package com.Binance.pages;

import com.Binance.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class HomePage extends BasePageObjects {

    @FindBy (id = "header_menu_ba-tableMarkets")
    public WebElement marketsButton;

    @FindBy(id = "header_menu_ba-trade")
    public WebElement tradeButton;

    @FindBy(xpath = "//*[text()='About Us']/../..//a")
    public List<WebElement> aboutUsFooterLinks;

    @FindBy(id = "header_menu_item_ba-spot-only")
    public WebElement spotButton;

    public void clickMarketButton(){
        marketsButton.click();
    }

    public void moveToTradeButton(){
        moveToElement(tradeButton);
    }

    public void clickSpotButton(){
        spotButton.click();
    }

    public void clickRandomFooterLink(){
        aboutUsFooterLinks.get(new Random().nextInt(aboutUsFooterLinks.size()-1)).click();
    }


}
