package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.ParentClass;

import static utilities.ElementClass.$;

public class UserStory12Steps extends ParentClass {
    @Then("^user navigate to Attestations page$")
    public void userNavigateToAttestationsPage() {
        clickOnMenuTo(NavMenu.Attestations);
    }

    @Then("^user create a new Attestations as \"([^\"]*)\"$")
    public void userCreateANewAttestationsAs(String name)  {
        $(PageButtonAdd).shouldBe(Condition.appear).click();
        $(DialogInputName).shouldBe(Condition.visible).setValue(name);
        clickToDialogButton(Buttons.Save);


    }

    @When("^user update the Attestations named as \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userUpdateTheAttestationsNamedAsTo(String oldName, String newName) {
        editTableData(oldName);
        $(DialogInputName).shouldBe(Condition.appear).clear().setValue(newName);
        clickToDialogButton(Buttons.Save);
    }

    @When("^user delete the grade Attestations as \"([^\"]*)\"$")
    public void userDeleteTheGradeAttestationsAs(String name)  {
        deleteTableData(name);

    }

    @When("^user search Attestations name \"([^\"]*)\"$")
    public void userSearchAttestationsName(String name) {
        $(PageSearchInputName).setValue(name);
        $(PageButtonSearch).click();

    }

    @Then("^user check the found result by \"([^\"]*)\"$")
    public void userCheckTheFoundResultBy(String name)  {
        WebElement text=getTableRowWithText(name);
        String strText= text.getText();

        Assert.assertTrue(strText.toLowerCase().contains( name.toLowerCase()));

    }


}
