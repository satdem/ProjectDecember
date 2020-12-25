package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.NotificationResults;
import utilities.ParentClass;

import static utilities.ElementClass.$;

public class UserStory09Steps extends ParentClass {

    @Then("^user navigate to Budget Projects page$")
    public void userNavigateToBudgetProjectsPage() {
        clickOnMenuTo(NavMenu.BudgetProjects);
    }

    @When("^user create an Budget Project name as \"([^\"]*)\" and account code as \"([^\"]*)\"$")
    public void userCreateAnBudgetProjectNameAsAndAccountCodeAs(String name, String accountCode) {
        $(PageButtonAdd).click();
        $(DialogInputName).setValue(name);
        $(DialogSelectAccountCode).setValue(accountCode).selectOptionWithIndex(1);
        clickToDialogButton(Buttons.Save);
    }

    @When("^user create an Budget Project name as \"([^\"]*)\"$")
    public void userCreateAnBudgetProjectNameAs(String name)  {
        $(PageButtonAdd).click();
        $(DialogInputName).setValue(name);
        clickToDialogButton(Buttons.Save);
    }

    @Then("^Save button should not be enabled$")
    public void saveButtonShouldNotBeEnabled() {
        Assert.assertTrue($(DialogContainerButtonSave).isDisplayed());
        clickToDialogButton(Buttons.Close);
    }
}
