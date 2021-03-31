package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public @FindBy(css = ".active .first-item-of-mobile-line:nth-child(5) img") WebElement summerDressImg;


}
