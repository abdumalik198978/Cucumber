package steps_definition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.google_pages.GoogleLandingPage;
import utilities.Config;
import utilities.Driver;

public class Google_StepDefs {
    GoogleLandingPage googleLandingPage = new GoogleLandingPage();

    @When("User is on google homepage")
    public void user_is_on_google_homepage() {
        Driver.getDriver().get(Config.getProperties("GoogleUrl"));
    }

    @Then("User should see title contains Google")
    public void user_should_see_title_contains_Google() {
        String actialResult = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue("It is not contains",actialResult.contains(expectedTitle));

    }


    @When("User types wooden spoon into the search box")
    public void user_types_wooden_spoon_into_the_search_box() {
        googleLandingPage.SearchBox.sendKeys(Config.getProperties("inputForSearch"));

    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {
        googleLandingPage.searchButton.click();

    }

    @Then("User should see wooden spoon in the title")
    public void user_should_see_wooden_spoon_in_the_title() {
        String expectedTitle = "wooden spoon";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("It doesn't contain",actualTitle.contains(expectedTitle));

    }


}
