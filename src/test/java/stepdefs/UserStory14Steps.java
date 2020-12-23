package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.ParentClass;

import static utilities.ElementClass.$;
import static utilities.ElementsClass.$$;

public class UserStory14Steps extends ParentClass {

    @When("^User navigate to Dismissal Articles Page$")
    public void userNavigateToDismissalArticlesPage() {

        clickOnMenuTo(NavMenu.DismissalArticles);
    }

    @Then("^the new input should be dismissal page$")
    public void theNewInputShouldBeDismissalPage() {
        Assert.assertTrue($$(DismissalArticles).getElements().size()>0);
    }

    @And("^user add a dismissal name as \"([^\"]*)\"$")
    public void userAddADismissalNameAs(String name)  {
        $(PageButtonAdd).shouldBe(Condition.appear).click();

        $(DialogInputName).shouldBe(Condition.appear).setValue(name);

        clickToDialogButton(Buttons.Save);

    }

    @When("^User edit  dismissal articles name as \"([^\"]*)\" to new name as \"([^\"]*)\"$")
    public void userEditDismissalArticlesNameAsToNewNameAs(String oldName, String name)  {
        editTableData(oldName);
        $(DialogInputName).shouldBe(Condition.appear).clear().setValue(name);
        clickToDialogButton(Buttons.Save);

    }

    @When("^user search  dismissal articles name as \"([^\"]*)\"$")
    public void userSearchDismissalArticlesNameAs(String name)  {
        getTableRowWithText(name);
    }

    @When("^user delete the  dismissal articles name as \"([^\"]*)\"$")
    public void userDeleteTheDismissalArticlesNameAs(String name)  {
        deleteTableData(name);
    }
}
