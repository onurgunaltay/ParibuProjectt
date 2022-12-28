package com.Binance.pages;

import com.Binance.utilities.ConfigurationReader;
import com.Binance.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePageObjects {
    public BasePageObjects (){
        PageFactory.initElements(Driver.get(), this);
    }

    public void openUrl (){
        Driver.get().get(ConfigurationReader.get("url"));
        wait(4);
    }

    public void wait (int waitTime){
        try {
            Thread.sleep(waitTime*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moveToElement(WebElement element){
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }
}
