package com.map.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddressPage extends BasePage {
    @AndroidFindBy(accessibility = "share-icon")
    @iOSXCUITFindBy(id = "share-icon")
    private MobileElement shareIcon;

    @AndroidFindBy(accessibility = "star-icon")
    @iOSXCUITFindBy(id = "star-icon")
    private MobileElement starIcon;

    @AndroidFindBy(accessibility = "route-button")
    @iOSXCUITFindBy(id = "route-button")
    private MobileElement routeButton;

    @AndroidFindBy(accessibility = "back-button")
    @iOSXCUITFindBy(id = "back-button")
    private MobileElement backButton;

    public AddressPage() {

    }

    public boolean validateIsShareIconDisplayed() {
        return find(shareIcon, 2000);
    }

    public boolean validateIsStarIconDisplayed() {
        return find(starIcon, 2000);
    }

    public boolean validateIsRouteButtonDisplayed() {
        return find(routeButton, 2000);
    }

    public boolean validateIsBackButtonDisplayed() {
        return find(backButton, 2000);
    }

    public void clickRouteButton() {
        click(routeButton,"click route button");
    }

}
