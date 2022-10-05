package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;


public class AccessoriesPage extends Utilities {


    String expectedUrl = "https://www.lcwaikiki.com/tr-TR/TR/lp/kadin-erkek-cocuk-bebek-aksesuar";

    @FindBy(css = "[class=container-fluid] [class=fullwidth]:nth-child(1)")
    public WebElement manShoes;

    public void clickManShoes() {
        clickElement(manShoes);
    }

    @FindBy(css = "[class=\"product-grid\"] [class=\"product-card product-card--one-of-4\"]:nth-child(2)")
    public WebElement selectedShoes;

    @FindBy(css = "[class=\"add-to-cart button-link add-to-cart-button \"]")
    public WebElement addToCartButton;

    @FindBy(xpath = "div#option-size > .selected")
    public WebElement selectSize;

    public void clickSelectedShoes() {
        clickElement(selectedShoes);
    }

    public void selectSize() {
        centerElement(selectSize);
    }

    public void addToCart() {
        clickElement(addToCartButton);
    }

    public void verifyAccessoriesScreen() {

        verifyCurrentScreen(expectedUrl);
    }
}




