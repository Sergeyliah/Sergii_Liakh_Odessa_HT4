package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".col-md-6 > .cart-detailed-totals-modal .value")
    private WebElement totalPrice;
    @FindBy(css = ".product-line-grid-quantity .bootstrap-touchspin-down")
    private  WebElement minusButton;
    @FindBy(xpath = "//button[contains(text(),'Продовжити покупки')]")
    private WebElement continueShoppingButton;
    @FindBy(css = ".checkout:nth-child(1) .btn")
    private WebElement toOpenCartButton;
    @FindBy(xpath = "(//a[contains(text(),'Оформити замовлення')])[2]")
    private WebElement makeOrderButton;

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public String getTotalPriceFromCart() {
        return totalPrice.getText();
    }
    public void clickOnMinusButton(){
        minusButton.click();
    }
    public void clickContinueShopping(){
        continueShoppingButton.click();
    }
    public void clickToOpenCartButton(){
        toOpenCartButton.click();
    }
    public void makeOrder(){
        makeOrderButton.click();
    }
}
