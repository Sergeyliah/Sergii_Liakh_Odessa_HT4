package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest{
    private static final long DEFAULT_WAITING_TIME = 90;


    @Test
    public void checkTotalPriceAtCart() {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickKindsOfSportsButton();
        getHomePage().clickWaterSportsButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getYachtingClothingButton());

        getHomePage().clickYachtingClothingButton();
        getHomePage().waitVisibilityOfElement(30, getSearchResultsPage().getBlueYachtJacket());
        getSearchResultsPage().clickOnBlueYachtJacket();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getProductPage().getAddToCartButton());
        getProductPage().clickAddToCartButton();
        assertTrue(getShoppingCartPage().getTotalPriceFromCart().contains("1 199,00 ₴"));
    }
    @Test
    public void removeItemFromCart(){
        getHomePage().enterTextToSearchField("каяк");
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getSearchResultsPage().getYellowSingleKayak());
        getSearchResultsPage().clickOnYellowSingleKayak();
        getProductPage().clickAddToCartButton();
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
        getShoppingCartPage().clickOnMinusButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getShoppingCartPage().getContinueShoppingButton());
        getShoppingCartPage().clickContinueShopping();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getTextOnCartIcon());
        assertEquals(getHomePage().getTextFromCartIcon(), "0");
        }
    @Test
    public void addItemToCart(){
        getHomePage().enterTextToSearchField("каяк");
        getSearchResultsPage().clickOnYellowSingleKayak();
        getProductPage().clickAddToCartButton();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getShoppingCartPage().getContinueShoppingButton());
        getShoppingCartPage().clickContinueShopping();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getTextOnCartIcon());
        assertEquals(getHomePage().getTextFromCartIcon(), "1");
    }

}
