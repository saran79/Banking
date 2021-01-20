package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionsLibrary.CommonFunctions;
import functionsLibrary.Constants;
import org.junit.Assert;
import pageObjects.LoginPage;

import java.nio.charset.CoderMalfunctionError;

public class LoginSteps extends CommonFunctions {

    LoginPage loginPage = new LoginPage(driver);
    @Given("^I navigate to the provided URL$")
    public void i_navigate_to_the_provided_URL() throws Exception {
        driver.get(readPropertyFiles("url"));
        }

    @When("^I am on the Login Page$")
    public void i_am_on_the_Login_Page()  {
        wait(5);
       // Assert.assertTrue(loginPage.validateLogo());
        }

    @When("^I enter the UserName as \"([^\"]*)\"$")
    public void i_enter_the_UserName_as(String userName)  {
        loginPage.setUserName(userName);
        }

    @When("^I enter the Password as \"([^\"]*)\"$")
    public void i_enter_the_Password_as(String password)  {
        loginPage.setPassword(password);
        }

    @When("^I click the Login Button$")
    public void i_click_the_Login_Button()  {
        loginPage.clkLogin();
        }

    @Then("^I Should be able to login into the Application Successfully$")
    public void i_Should_be_able_to_login_into_the_Application_Successfully()  {
        Assert.assertEquals(Constants.LOGIN_SUCCESS,loginPage.getLoginText());
        }

}
