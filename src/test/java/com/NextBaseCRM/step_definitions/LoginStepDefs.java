package com.NextBaseCRM.step_definitions;

import com.NextBaseCRM.pages.LoginPage;
import com.NextBaseCRM.utilities.BrowserUtils;
import com.NextBaseCRM.utilities.ConfigurationReader;
import com.NextBaseCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
       //WebDriver driver = Driver.get();
        Driver.get().get(url);

    }
    @When("the user enters the helpdesk information")
    public void the_user_enters_the_helpdesk_information() {

        BrowserUtils.waitFor(2);
        String username = ConfigurationReader.get("helpdesk_username");
        String password = ConfigurationReader.get("helpdesk_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }
    @When("the user enters the marketing manager information")
    public void the_user_enters_the_marketing_manager_information() {

        String username = ConfigurationReader.get("marketing_manager_username");
        String password = ConfigurationReader.get("marketing_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }
    @When("the user enters the hr manager information")
    public void the_user_enters_the_hr_manager_information() {

        String username = ConfigurationReader.get("hr_manager_username");
        String password = ConfigurationReader.get("hr_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        // System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.contains("Portal"));

    }
    @Then("User should be able to click a post to favorite by clicking on the Star icon.")
    public void user_should_be_able_to_click_a_post_to_favorite_by_clicking_on_the_Star_icon() {

        LoginPage loginPage = new LoginPage();

        loginPage.starIcon.click();

        BrowserUtils.waitFor(2);
    }
    @Then("User should be able to click on Activity Stream Search box")
    public void user_should_be_able_to_click_on_Activity_Stream_Search_box() {
        LoginPage loginPage = new LoginPage();

        loginPage.FilSearch.click();

        BrowserUtils.waitFor(2);

    }
    @Then("User should be able to click on Favorites filter on the left of Filter module.")
    public void user_should_be_able_to_click_on_Favorites_filter_on_the_left_of_Filter_module() {
        LoginPage loginPage = new LoginPage();

        loginPage.favoriteBtn.click();

        BrowserUtils.waitFor(5);
    }
    @Then("Verify the favorite post added by User now display on Activity Stream Filtered Page")
    public void verify_the_favorite_post_added_by_User_now_display_on_Activity_Stream_Filtered_Page() {

        LoginPage loginPage = new LoginPage();

        Assert.assertTrue(loginPage.starIcon.isEnabled());
    }

    @When("the user enters the {string} information")
    public void the_user_enters_the_information(String userType) {

        switch (userType){
            case "helpdesk":
                the_user_enters_the_helpdesk_information();
                break;
            case "marketing":
                the_user_enters_the_marketing_manager_information();
                break;
            case "hr":
                the_user_enters_the_hr_manager_information();
                break;
            default:
                System.out.println("There is not any user in system such as "+userType);

        }
        //njknmj


    }

}
