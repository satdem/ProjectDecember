package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.ParentClass;

import static utilities.ElementClass.$;

public class UserStory13Steps extends ParentClass{

        @When("^user navigate to Position Categories page$")
        public void userNavigateToPositionCategoriesPage() {

            clickOnMenuTo(NavMenu.PositionCategories);
        }


    @When("^user create the Position Category named as \"([^\"]*)\"$")
    public void userCreateThePositionCategoryNamedAs(String name){
        $(PageButtonAdd).shouldBe(Condition.appear).click();

        $(DialogInputName).shouldBe(Condition.appear).setValue(name);

        clickToDialogButton(Buttons.Save);

    }

    @When("^user update the Position Category named as \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userUpdateThePositionCategoryNamedAsTo(String oldName, String name)  {
        editTableData(oldName);
        $(DialogInputName).shouldBe(Condition.appear).clear().setValue(name);
        clickToDialogButton(Buttons.Save);

    }

    @When("^user search a Position Category \"([^\"]*)\"$")
    public void userSearchAPositionCategory(String name)  {
        getTableRowWithText(name);

    }

    @When("^user delete a Position Category \"([^\"]*)\"$")
    public void userDeleteAPositionCategory(String name)  {
        deleteTableData(name);


    }
}









