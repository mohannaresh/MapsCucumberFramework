package com.map.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class NavigationPage extends BasePage {

    @AndroidFindBy(accessibility = "navigation-direction-blue-line")
    @iOSXCUITFindBy(id = "navigation-direction-blue-line")
    private MobileElement navigationDirectionBlueLine;

    @AndroidFindBy(accessibility = "volume-icon")
    @iOSXCUITFindBy(id = "volume-icon")
    private MobileElement volumeIcon;

    @AndroidFindBy(accessibility = "close-icon")
    @iOSXCUITFindBy(id = "close-icon")
    private MobileElement closeIcon;

    public boolean isNavigateDirectionLinePresent() {
        return find(navigationDirectionBlueLine, 2000);
    }

    public boolean isVolumeIconPresent() {
        return find(volumeIcon, 2000);
    }

    public boolean isCloseIconPresent() {
        return find(closeIcon, 2000);
    }


}
