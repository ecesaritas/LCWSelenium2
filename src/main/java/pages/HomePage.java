package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utilities;

import java.util.List;

public class HomePage extends Utilities {

    String expectedUrl = "https://www.lcwaikiki.com/tr-TR/TR";

    @FindBy(css = "[class*='menu-header-item']")
    public List<WebElement> homePageCategories;

    @FindBy(css = "[id=\"cookieseal-banner\"] [class=cookieseal-banner-body] button:nth-child(3)")
    public WebElement cookiePopup;

    public void clickHomePageCategory(String categoryName) {
        for (WebElement category : homePageCategories) {
            if (category.getText().equalsIgnoreCase(categoryName)) {
                category.click();
                return;
            }
        }
        Assert.fail("No category name found");
    }

    public void closeCookie() {
        clickElement(cookiePopup);
    }

    public void verifyHomeScreen() {
        verifyCurrentScreen(expectedUrl);
    }

}
