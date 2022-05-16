package com.map.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

public class MapsHomePage extends BasePage {
    @AndroidFindBy(accessibility = "address-textbox")
    @iOSXCUITFindBy(id = "address-textbox")
    private MobileElement searchAddressTxtFld;

    @AndroidFindBy(accessibility = "speedlimit-icon")
    @iOSXCUITFindBy(id = "speedlimit-icon")
    private MobileElement speedLimit;

    @AndroidFindBy(accessibility = "report-icon")
    @iOSXCUITFindBy(id = "report-icon")
    private MobileElement reportAnIssue;


    @AndroidFindBy(accessibility = "direction-icon")
    @iOSXCUITFindBy(id = "direction-icon")
    private MobileElement direction;

    @AndroidFindBy(accessibility = "three-dots-menu")
    @iOSXCUITFindBy(id = "three-dots-menu")
    private MobileElement threeDotsMenu;


    public MapsHomePage() {

    }


    public MapsHomePage enterAddress(String address) {
        clear(searchAddressTxtFld);
        sendKeys(searchAddressTxtFld, address, "entered address" + address);
        return this;
    }

    public String getTextFromAddressTextBox() {
        return getText(searchAddressTxtFld, "Getting text present in textbox");
    }

    public boolean checkIsSpeedLimitDisplayed() {
        return find(speedLimit, 2000);
    }

    public boolean checkIsReportAnIssueDisplayed() {
        return find(reportAnIssue, 2000);
    }

    public boolean checkIsDirectionDisplayed() {
        return find(direction, 2000);
    }

    public void selectAddressFromAutoSuggestionTextView(String addressText) {

    }

    public void clickOnThreeDotsMenuOption() {
        click(threeDotsMenu);
    }

    public void clickReportAnIssueIcon() {
        click(reportAnIssue, "Clicked on report an issue icon");
    }

    public boolean validateReportedIssueOnMap(String inputReportIssue) {
        By reportIssueElementOnMap = By.xpath("//*[@text()=" + inputReportIssue + "]");
        return find(reportIssueElementOnMap, 2000);
    }
}
