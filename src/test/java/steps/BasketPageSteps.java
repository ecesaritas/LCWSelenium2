package steps;

import io.cucumber.java.en.Given;
import pages.BasketPage;

public class BasketPageSteps {

    BasketPage basketPage = new BasketPage();

    @Given("Click Shopping Cart")
    public void clickShoppingCart() {
        basketPage.clickShoppingCart();
    }

}
