package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.ParentClass;


import static utilities.ElementClass.$;

public class UserStory08Steps extends ParentClass {
    @Then("^user navigate to Item Category page$")
    public void userNavigateToItemCategoryPage() {
        clickOnMenuTo(NavMenu.ItemCategories);
    }

    @When("^user create an Item Category name as \"([^\"]*)\" and user types as \"([^\"]*)\"$")
    public void userCreateAnItemCategoryNameAsAndUserTypesAsFollows(String name, String userType)  {
        $(PageButtonAdd).click();
        $(DialogInputName).shouldBe(Condition.appear).setValue(name);
        $(DialogSelectUserType).selectOptionWithText(userType);
        clickToDialogButton(Buttons.Save);
    }

    @When("^user search Item Category name as \"([^\"]*)\"$")
    public void userSearchItemCategoryNameAs(String searchText) {
        $(PageSearchInputName).setValue(searchText);
        $(PageButtonSearch).click();

    }

    @And("^user close the dialogbox$")
    public void userCloseTheDialogbox() {
        clickToDialogButton(Buttons.Close);
    }
}
