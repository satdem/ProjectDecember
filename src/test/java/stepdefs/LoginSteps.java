package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Driver;
import utilities.NotificationResults;
import utilities.ParentClass;

import static utilities.ElementsClass.$$;


public class LoginSteps extends ParentClass {
    @Given("^user navigate to basqar$")
    public void userNavigateToBasqar() {
        getHomePage();
    }

    @When("^user loggin to basqar$")
    public void userLogginToBasqar() {
        login();
    }

    @Then("^login should be successfull$")
    public void loginShouldBeSuccessfull() {
        Assert.assertTrue($$(DashBoard).getElements().size()>0);
    }

    @Then("^the new input should be created$")
    public void theNewInputShouldBeCreated() {
        verifyNotificationAs(NotificationResults.created);
    }

    @Then("^the input should be updated$")
    public void theInputShouldBeUpdated() {
        verifyNotificationAs(NotificationResults.updated);
    }

    @Then("^the input should be deleted$")
    public void theInputShouldBeDeleted() {
        verifyNotificationAs(NotificationResults.deleted);
    }

    @Then("^the new input should not be created$")
    public void theNewInputShouldNotBeCreated() {
        clickToDialogButton(Buttons.Close);
        verifyNotificationAs(NotificationResults.Error);
    }

    @When("^user click to Dashboard$")
    public void userClickToDashboard() {
        clickOnMenuTo(NavMenu.Dashboard);
    }

    @When("^user logged out$")
    public void userLoggedOut() {
        Driver.quitDriver();
    }


}
