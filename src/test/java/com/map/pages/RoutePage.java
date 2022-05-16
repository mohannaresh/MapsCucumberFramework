package com.map.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RoutePage extends BasePage {
    @AndroidFindBy(accessibility = "options-button")
    @iOSXCUITFindBy(id = "options-button")
    private MobileElement optionsButton;

    @AndroidFindBy(accessibility = "go-button")
    @iOSXCUITFindBy(id = "go-button")
    private MobileElement goButton;

    @AndroidFindBy(accessibility = "close-icon")
    @iOSXCUITFindBy(id = "close-icon")
    private MobileElement closeIcon;

    @AndroidFindBy(accessibility = "avoid-on-route-tollroads")
    @iOSXCUITFindBy(id = "avoid-on-route-tollroads")
    private MobileElement avoidOnRouteTollroads;

    @AndroidFindBy(accessibility = "avoid-on-route-ferries")
    @iOSXCUITFindBy(id = "avoid-on-route-ferries")
    private MobileElement avoidOnRouteFerries;

    @AndroidFindBy(accessibility = "avoid-on-route-motorways")
    @iOSXCUITFindBy(id = "avoid-on-route-motorways")
    private MobileElement avoidOnRouteMotorways;

    @AndroidFindBy(accessibility = "avoid-on-route-unpaved-roads")
    @iOSXCUITFindBy(id = "avoid-on-route-unpaved-roads")
    private MobileElement avoidOnRouteUnpavedRoads;

    public void clickOptionsButton() {
        click(optionsButton, "Click options button");
    }

    public void clickGoButton() {
        click(goButton, "Click go button");
    }

    public void clickCloseIcon() {
        click(closeIcon, "Click close icon");
    }

    public boolean isGoButtonDisplayed(){
        return find(goButton,2000);
    }

    public boolean isOptionsButtonDisplayed(){
        return find(optionsButton,2000);
    }

    public boolean isCloseIconDisplayed(){
        return find(closeIcon,2000);
    }

    public String getTollroadsOptionsText() {
        clickOptionsButton();
        return getText(avoidOnRouteTollroads, "avoidOnRouteTollroads options is present");
    }

    public String getFerriesOptionText() {
        clickOptionsButton();
        return getText(avoidOnRouteFerries, "avoidOnRouteFerries options is present");
    }

    public String getMotorwaysOptionText() {
        clickOptionsButton();
        return getText(avoidOnRouteMotorways, "avoidOnRouteMotorways options is present");
    }

    public String getUnpavedRoadsOptionText() {
        clickOptionsButton();
        return getText(avoidOnRouteUnpavedRoads, "avoidOnRouteUnpavedRoads options is present");
    }
}
