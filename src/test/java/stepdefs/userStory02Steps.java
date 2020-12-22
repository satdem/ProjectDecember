package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.ParentClass;

import static utilities.ElementClass.$;

public class userStory02Steps extends ParentClass {
    @When("^user navigate to Nationalities page$")
    public void userNavigateToNationalitiesPage() {
        clickOnMenuTo(NavMenu.Nationalities);
    }

    @And("^user add a nationality \"([^\"]*)\"$")
    public void userAddANationality(String name) {
        $(PageButtonAdd).shouldBe(Condition.appear).click();
        $(DialogInputName).shouldBe(Condition.appear).setValue(name);
        clickToDialogButton(Buttons.Save);
    }


    @When("^user update the natianality named as \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userUpdateTheNatianalityNamedAsTo(String oldName, String name)  {
        editTableData(oldName);
        $(DialogInputName).shouldBe(Condition.appear).clear().setValue(name);
        clickToDialogButton(Buttons.Save);
    }

    @When("^user delete the nationality named as \"([^\"]*)\"$")
    public void userDeleteTheNationalityNamedAs(String name) {
        deleteTableData(name);
    }
}
