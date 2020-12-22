package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.ParentClass;

import static utilities.ElementClass.$;

public class UserStory03Steps extends ParentClass {
    @When("^user navigate to Fees page$")
    public void userNavigateToFeesPage() {
        clickOnMenuTo(NavMenu.Fees);
    }

    @And("^user add a fee \"([^\"]*)\" \"([^\"]*)\"   \"([^\"]*)\"$")
    public void userAddAFee(String name, String code, String integrationCode) {
        $(PageButtonAdd).shouldBe(Condition.appear).click();
        $(DialogInputName).shouldBe(Condition.appear).setValue(name);
        $(DialogInputCode).setValue(code);
        $(DialogInputIntegrationCode).setValue(integrationCode);
        clickToDialogButton(Buttons.Save);

    }

    @When("^user update the fee named as \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userUpdateTheFeeNamedAsTo(String oldName, String name) {
        editTableData(oldName);
        $(DialogInputName).shouldBe(Condition.appear).clear().setValue(name);
        clickToDialogButton(Buttons.Save);
    }


    @When("^user delete the fees named as \"([^\"]*)\"$")
    public void userDeleteTheNationalityNamedAs(String name) {
        deleteTableData(name);
    }


    @When("^user search the fee named as \"([^\"]*)\"$")
    public void userSearchTheFeeNamedAs(String name) {
        getTableRowWithText(name);
    }
}
