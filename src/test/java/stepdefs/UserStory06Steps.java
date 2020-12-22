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

public class UserStory06Steps extends ParentClass {


    @When("^User navigate to Document Types page$")
    public void userNavigateToDocumentTypesPage() {

        clickOnMenuTo(NavMenu.DocumentTypes);

    }

    @Then("^the new input should be document page$")
    public void theNewInputShouldBeDocumentPage() {

        Assert.assertTrue($$(PageButtonSearchWithText).getElements().size()>0);
    }

    @And("^user add a document name as \"([^\"]*)\"$")
    public void userAddADocumentNameAs(String name) throws Throwable {
        $(PageButtonAdd).shouldBe(Condition.appear).click();

        $(DialogInputName).shouldBe(Condition.appear).setValue(name);

        //  clickToDialogButton(Buttons.Save);

    }

    @And("^user click to stage name \"([^\"]*)\"$")
    public void userClickToStageName(String name)
    {
        $(DialogSelectStage).selectOptionWithText(name);
        clickToDialogButton(Buttons.Save);

    }

    @When("^user delete the document name as \"([^\"]*)\"$")
    public void userDeleteTheDocumentNameAs(String name) {
        deleteTableData(name);

    }

    @Then("^User edit  document name as \"([^\"]*)\" to new name as \"([^\"]*)\"$")
    public void userEditDocumentNameAsToNewNameAs(String oldName, String name)  {

        editTableData(oldName);
        $(DialogInputName).shouldBe(Condition.appear).clear().setValue(name);
        clickToDialogButton(Buttons.Save);

    }


    @When("^user search document name as \"([^\"]*)\"$")
    public void userSearchDocumentNameAs(String name)  {

        //   $(DialogInputName).shouldBe(Condition.appear).clear().setValue(name);
        //   $(PageButtonSearch).shouldBe(Condition.appear).click();
        getTableRowWithText(name);
    }
}
