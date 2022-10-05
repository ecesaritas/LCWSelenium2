package steps;

import io.cucumber.java.en.Given;
import pages.CheckoutPage;

public class CheckoutPageSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("Return back to HomePage")
    public void returnBacktoHomePage() {
        checkoutPage.returnBacktoHomePage();
    }

    @Given("Verify Checkout Screen")
    public void verifyCurrentScreen() {
        checkoutPage.verifyCheckoutScreen();
    }
}
