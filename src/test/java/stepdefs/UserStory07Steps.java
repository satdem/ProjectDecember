package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pageModels.NavMenu;
import utilities.Condition;
import utilities.ParentClass;

import java.util.Map;

import static utilities.ElementClass.$;

public class UserStory07Steps extends ParentClass {

    @Then("^user navigate to Notification page$")
    public void userNavigateToNotificationPage() {
        clickOnMenuTo(NavMenu.Notifications);
    }


    @When("^user create an notification as follows$")
    public void userCreateAnNotificationAsFollows(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        $(PageButtonAdd).click();
        $(DialogInputName).shouldBe(Condition.appear).setValue(map.get("name"));
        $(DialogInputDescription2).setValue(map.get("description"));
        $(PageSelectType).selectOptionWithText(map.get("type"));
        $(PageButtonSave).click();
    }

    @When("^user search \"([^\"]*)\"$")
    public void userSearch(String searchText)  {
        $(PageSearchInputName2).setValue(searchText);
        $(PageButtonSearch).click();
    }

    @Then("^search by name as \"([^\"]*)\" should be listed$")
    public void searchByNameAsShouldBeListed(String searchedText) {
        getTableRowWithText(searchedText);
    }

    @When("^user edit the table data named as \"([^\"]*)\"$")
    public void userEditTheTheDataNamedAs(String searchText)  {
        clickToButtonInTable(TableButtonEdit, searchText);
    }

    @When("^user delete the table data name as \"([^\"]*)\"$")
    public void userDeleteTheTableDataNameAs(String searchText)  {
        deleteTableData(searchText);
    }

    @Then("^the data should be edited$")
    public void shouldBeEdited() {
        $(PageButtonSave).shouldBe(Condition.appear);
    }
}
