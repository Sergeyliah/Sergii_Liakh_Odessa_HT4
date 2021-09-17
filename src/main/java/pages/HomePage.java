package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[text()='Види спорту']")
    private WebElement kindsOfSportsButton;

    @FindBy(xpath = "//a[contains(text(),'Водні види спорту')]")
    private WebElement waterSportsButton;

    @FindBy(css = "#searchbox #aa-search-input")
    private WebElement searchField;

    @FindBy(xpath = "//a[@href='https://www.decathlon.ua/uk/26861-odyag']")
    private WebElement yachtingClothingButton;

    @FindBy(css = "#modal-cart > .cart-count")
    private WebElement textOnCartIcon;

    public WebElement getYachtingClothingButton() {
        return yachtingClothingButton;
    }

    public WebElement getTextOnCartIcon() {
        return textOnCartIcon;
    }

    public void clickKindsOfSportsButton(){
        kindsOfSportsButton.click();
    }
    public void clickWaterSportsButton(){
        waterSportsButton.click();
    }
    public void clickYachtingClothingButton(){
        yachtingClothingButton.click();
    }
    public void enterTextToSearchField(String text){
        searchField.sendKeys(text);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }
    public String getTextFromCartIcon(){
        return textOnCartIcon.getText();
    }
}
