package com.map.stepdef;

import com.map.pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MapStepdefs {
    @When("User enter {string} in the search bar")
    public void user_enter_in_the_search_bar(String address) {
        new MapsHomePage().enterAddress(address);
    }

    @Then("Validate that all expected icons are shown properly")
    public void validate_that_all_expected_icons_are_shown_properly() {
        Assert.assertTrue("Missing speed limit icon on homepage", new MapsHomePage().checkIsSpeedLimitDisplayed());
        Assert.assertTrue("Missing report an option icon on homepage", new MapsHomePage().checkIsReportAnIssueDisplayed());
        Assert.assertTrue("Missing Direction icon on homepage", new MapsHomePage().checkIsDirectionDisplayed());
    }

    @When("User choose an {string} from auto suggested text view")
    public void user_choose_an_from_auto_suggested_text_view(String addressText) {
        new MapsHomePage().selectAddressFromAutoSuggestionTextView(addressText);
    }


    @Then("Validate that share option,star icon,route button,close map,back button are present")
    public void validate_that_share_option_star_icon_route_button_close_map_back_button_are_present() {
        Assert.assertTrue("Missing star icon on address page", new AddressPage().validateIsStarIconDisplayed());
        Assert.assertTrue("Missing share icon on address page", new AddressPage().validateIsShareIconDisplayed());
        Assert.assertTrue("Missing route button on address page", new AddressPage().validateIsRouteButtonDisplayed());
    }

    @When("user click on route button")
    public void user_click_on_route_button() {
        new AddressPage().clickRouteButton();
    }

    @Then("Validate that route information page has all proper information")
    public void validate_that_route_information_page_has_all_proper_information() {
        Assert.assertTrue("Go button is present", new RoutePage().isGoButtonDisplayed());
        Assert.assertTrue("Options button is present", new RoutePage().isOptionsButtonDisplayed());
        Assert.assertTrue("Close icon is present", new RoutePage().isCloseIconDisplayed());
    }

    @When("Uer click on the options button")
    public void uer_click_on_the_options_button() {
        new RoutePage().clickOptionsButton();
    }

    @Then("User should see {string},{string},{string},{string} options are present")
    public void user_should_see_options_are_present(String tollRoads, String ferries, String motorWays, String unpavedRoads) {

        Assert.assertEquals("tollRoads option is displayed", tollRoads.toLowerCase(), new RoutePage().getTollroadsOptionsText().toLowerCase());
        Assert.assertEquals("ferries option is displayed", ferries.toLowerCase(), new RoutePage().getFerriesOptionText().toLowerCase());
        Assert.assertEquals("motorWays option is displayed", motorWays.toLowerCase(), new RoutePage().getMotorwaysOptionText().toLowerCase());
        Assert.assertEquals("tollRoads option is displayed", unpavedRoads.toLowerCase(), new RoutePage().getUnpavedRoadsOptionText().toLowerCase());
    }

    @When("User click on go button")
    public void user_click_on_go_button() {
        new RoutePage().clickGoButton();
    }

    @Then("Navigation shown on the map")
    public void navigation_shown_on_the_map() {
        Assert.assertTrue("Navigate direction line present", new NavigationPage().isNavigateDirectionLinePresent());
        Assert.assertTrue("Close icon is present", new NavigationPage().isCloseIconPresent());
        Assert.assertTrue("Volume icon is present", new NavigationPage().isVolumeIconPresent());
    }

    @When("User click on three dot menu option on the maps home page")
    public void user_click_on_three_dot_menu_option_on_the_maps_home_page() {
        new MapsHomePage().clickOnThreeDotsMenuOption();
    }

    @When("User click on the {string} and choose {string}")
    public void user_click_on_the_and_choose(String mainCategoryText, String subCategoryText) {
        new CategoriesPage().clickSubcategoryItemFromCategoryMenu(mainCategoryText, subCategoryText);
    }

    @Then("Validate {string} is matched with text present in search text box")
    public void validate_is_matched_with_text_present_in_search_text_box(String subCategoryText) {
        Assert.assertEquals("Validating sub category selected not equals to text present in search text box", subCategoryText.toLowerCase(), new MapsHomePage().getTextFromAddressTextBox());
    }

    @When("User click on report issue icon present on homepage")
    public void user_click_on_report_issue_icon_present_on_homepage() {
        new MapsHomePage().clickReportAnIssueIcon();
    }

    @Then("List of available options should be displayed")
    public void list_of_available_options_should_be_displayed(DataTable reportIssueDataTable) {
        Assert.assertTrue("Failed to compare reportIssueData input with displayed list on the map", new ReportIssuePage().validateReportIssueItemsList(reportIssueDataTable));
    }

    @When("User click on one of the {string} from report page")
    public void user_click_on_one_of_the_from_report_page(String inputReportIssue) {
        new ReportIssuePage().selectOneIssueFromTheDisplayList(inputReportIssue);
    }

    @Then("Map should display the {string} icon that was selected by the user on the map")
    public void map_should_display_the_icon_that_was_selected_by_the_user_on_the_map(String inputReportedIssue) {
        Assert.assertTrue("Failed to validate the reported issue selected by user on map homepage", new MapsHomePage().validateReportedIssueOnMap(inputReportedIssue));
    }
}
