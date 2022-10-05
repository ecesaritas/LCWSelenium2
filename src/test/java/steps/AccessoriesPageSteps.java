package steps;

import io.cucumber.java.en.Given;
import pages.AccessoriesPage;

public class AccessoriesPageSteps {

    AccessoriesPage accessoriesPage = new AccessoriesPage();

    @Given("Click Man Shoes")
    public void clickManShoes() {
        accessoriesPage.clickManShoes();
    }

    @Given("Click Selected Shoes")
    public void clickSelectedShoes() {
        accessoriesPage.clickSelectedShoes();
    }

    @Given("Select Size")
    public void selectSize() {
        accessoriesPage.selectSize();
    }

    @Given("Add to Cart")
    public void addToCart() {
        accessoriesPage.addToCart();
    }

    @Given("Verify Accessories Screen")
    public void verifyCurrentScreen() {
        accessoriesPage.verifyAccessoriesScreen();
    }

}
