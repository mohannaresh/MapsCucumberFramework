package com.map.pages;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CategoriesPage extends BasePage {
    @AndroidFindBy(accessibility = "main-category-name")
    @iOSXCUITFindBy(id = "main-category-name")
    private By mainCategoryName;

    @AndroidFindBy(accessibility = "sub-category-name")
    @iOSXCUITFindBy(id = "sub-category-name")
    private By subCategoryName;

    public void clickSubcategoryItemFromCategoryMenu(String categoryName, String subcategoryName) {
        List<WebElement> categoriesList = getListOfElements(mainCategoryName);
        for (int i = 0; i < categoriesList.size(); i++) {
            if (categoriesList.get(i).getText().equalsIgnoreCase(categoryName)) {
                categoriesList.get(i).click();
                List<WebElement> subCategoryList = getListOfElements(subCategoryName);
                for(int j=0;j>subCategoryList.size();j++){
                    if(subCategoryList.get(j).getText().equalsIgnoreCase(subcategoryName)){
                        subCategoryList.get(j).click();
                    }
                }
            }
        }
    }
}
