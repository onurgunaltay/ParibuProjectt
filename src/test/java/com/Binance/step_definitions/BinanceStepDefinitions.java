package com.Binance.step_definitions;

import com.Binance.pages.DetailPage;
import com.Binance.pages.HomePage;
import com.Binance.pages.LoginPage;
import com.Binance.pages.MarketsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BinanceStepDefinitions {
    LoginPage loginPage = new LoginPage();
    DetailPage detailPage = new DetailPage();
    MarketsPage marketsPage = new MarketsPage();
    HomePage homePage = new HomePage();


    @Given("The user should be at the Binance home page")
    public void theUserShouldBeAtTheBinanceHomePage(){

        homePage.openUrl();
    }

    @When("The user clicks markets button")
    public void theUserClicksMarketsButton() {

        homePage.clickMarketButton();
    }

    @And("The user clicks spot markets button on markets page")
    public void theUserClicksSpotMarketsButtonOnMarketsPage() {

        marketsPage.clickspotMarketsPage();
    }

    @And("The user clicks usdt button on markets page")
    public void theUserClicksUsdtButtonOnMarketsPage() {

        marketsPage.clickusdtElement();
    }

    @Then("The user clicks avax usdt button in spot markets list")
    public void theUserClicksAvaxUsdtButtonInSpotMarketsList() {

        marketsPage.clickavaxUsdtButton();
    }

    @Then("The user sees the new page opens succesfully")
    public void theUserSeesTheNewPageOpensSuccesfully() {
    }

    @When("The user sees that homepage is opened and waits on trade button on top header")
    public void theUserSeesThatHomepageIsOpenedAndWaitsOnTradeButtonOnTopHeader() {
        homePage.moveToTradeButton();

    }

    @And("The user clicks spot button in dropdown list of trade")
    public void theUserClicksSpotButtonInDropdownListOfTrade() {
        homePage.clickSpotButton();
    }

    @Then("The user sees the page opens succesfully")
    public void theUserSeesThePageOpensSuccesfully() {
        
    }
    @And("The user sees pop-up page and closes it")
    public void theUserSeesPopUpPageAndClosesIt() {
        detailPage.clickCloseButtonOfPopUp();
    }

    @And("The user clicks login button on opening page")
    public void theUserClicksLoginButtonOnOpeningPage() {
        detailPage.clickloginButton();

    }

    @And("The user tries to log in with wrong credentials")
    public void theUserTriesToLogInWithWrongCredentials() {
        loginPage.loginWithInvalidCredentials();
        loginPage.clicknextButton();

    }

    @Then("The user sees error message after triying to log in with wrong credentials")
    public void theUserSeesErrorMessageAfterTriyingToLogInWithWrongCredentials() {
    }

    @When("The user randomly clicks on links below aboutus title")
    public void theUserRandomlyClicksOnLinksBelowAboutusTitle() {
        homePage.clickRandomFooterLink();
        homePage.clickRandomFooterLink();
        homePage.clickRandomFooterLink();
        homePage.clickRandomFooterLink();
        homePage.clickRandomFooterLink();
    }

    @And("The user randomly clicks on links below aboutus title four times more")
    public void theUserRandomlyClicksOnLinksBelowAboutusTitleFourTimesMore() {

    }

    @Then("The user sees the pages open succesfully")
    public void theUserSeesThePagesOpenSuccesfully() {

    }

}
