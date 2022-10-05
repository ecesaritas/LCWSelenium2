package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

public class BasketPage extends Utilities {

    @FindBy(css = "svg#shopping-cart")
    public WebElement shoppingCart;

    public void clickShoppingCart() {
        clickElement(shoppingCart);
    }

}
