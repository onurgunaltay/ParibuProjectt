package com.Binance.pages;

import com.Binance.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class MarketsPage extends BasePageObjects{

    @FindBy(id = "market_sector_Spot")
    public WebElement spotMarketsButton;

    @FindBy(id= "tab-USDT")
    public WebElement usdtButton;

    @FindBy(xpath ="//*[text()='AVAX']")
    public WebElement avaxUsdtButton;

    public void clickspotMarketsPage() {

        spotMarketsButton.click();
    }

    public void clickusdtElement() {

        usdtButton.click();
    }

    public void clickavaxUsdtButton(){
        wait(3);
        avaxUsdtButton.click();


    }
}

