package com.map.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReportIssuePage extends BasePage {
    @AndroidFindBy(accessibility = "report-issue-container")
    @iOSXCUITFindBy(id = "report-issue-container")
    private By reportIssueContainer;

    public boolean validateReportIssueItemsList(DataTable reportIssueDataTable) {
        List<String> reportIssueList = getListOfElementsText(getListOfElements(reportIssueContainer));
        List<String> data = reportIssueDataTable.asList();
        return reportIssueList.equals(data);
    }

    public void selectOneIssueFromTheDisplayList(String inputReportIssue) {
        clickElementBasedOnText(getListOfElements(reportIssueContainer), inputReportIssue);
    }
}
