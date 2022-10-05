package steps;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("Click {} Category")
    public void clickCategory(String categoryName) {
        homePage.clickHomePageCategory(categoryName);
    }

    @Given("Close cookie")
    public void closeCookie() {
        homePage.closeCookie();
    }

    @Given("Verify Current Screen")
    public void verifyCurrentScreen() {
        homePage.verifyHomeScreen();
    }
}
