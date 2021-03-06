package pages.google_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleLandingPage {

    public GoogleLandingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (name = "q")
    public WebElement SearchBox;

    @FindBy(xpath = "(//input[@value ='Google Search'])[2]")
    public WebElement searchButton;
}
