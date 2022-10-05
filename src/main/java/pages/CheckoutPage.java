package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;

public class CheckoutPage extends Utilities {

    String expectedUrl = "https://www.lcwaikiki.com/tr-TR/TR/sepetim";

    @FindBy(css = "[class=\"main-header-logo\"]")
    public WebElement returnBacktoHomePage;

    public void returnBacktoHomePage() {
        clickElement(returnBacktoHomePage);
    }

    public void verifyCheckoutScreen() {
        verifyCurrentScreen(expectedUrl);
    }
}
