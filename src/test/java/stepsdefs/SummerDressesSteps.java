package stepsdefs;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SummerDressesSteps extends BasePage {
    public static WebDriver driver;

    @Given("^user navigates to homepage$")
    public void user_navigates_to_homepage(){
        driver = openUrl();
    }

    @When("^user adds summer dress to cart$")
    public void user_adds_summer_dress_to_cart(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", homePage.summerDressElement);
        //Thread.sleep(2000);
        homePage.addToCartButton.click();
    }

    @When("^use clicks checkout$")
    public void use_clicks_checkout(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", productDetailPage.proceedToCheckoutButton);
        js.executeScript("arguments[0].click();", productDetailPage.proceedToCheckoutButtonPopUp);
    }

    @When("^user clicks Proceed to checkout$")
    public void user_clicks_Proceed_to_checkout(){
        shoppingCartPage.proceedToCheckoutButton.click();
    }

    @Then("^Signin page is displayed$")
    public void signin_page_is_displayed(){
        String pageTitle = driver.getTitle();
        String expectedTitle = "Login - My Store";
        assertEquals("Test Failed", expectedTitle, pageTitle);
        assertTrue(signInPage.signInButton.isDisplayed());
    }

    @After
    public void afterScenario(){
        driver.quit();
    }
}
