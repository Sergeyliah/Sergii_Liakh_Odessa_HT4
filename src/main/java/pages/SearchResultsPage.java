package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage{
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".ais-InfiniteHits-item:nth-child(1) .description a")
    private WebElement blueYachtJacket;
    @FindBy(xpath = "//img[@data-src='https://contents.mediadecathlon.com/p1312118/k$49ce828ddd72548cf235d0dd216fca0e/prod.jpg?f=250x250']")
    private WebElement yellowSingleKayak;
    @FindBy(xpath = "//input[@value='Каяк']")
    private WebElement checkboxKayak;

    public WebElement getBlueYachtJacket() {
        return blueYachtJacket;
    }
    public WebElement getYellowSingleKayak() {
        return yellowSingleKayak;
    }
    public void clickOnBlueYachtJacket(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", blueYachtJacket);
    }
    public void clickOnYellowSingleKayak(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", yellowSingleKayak);
    }
    public void selectKayakCheckbox(){
        checkboxKayak.click();
    }
}
