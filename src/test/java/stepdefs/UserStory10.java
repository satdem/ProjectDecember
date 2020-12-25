package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.ParentClass;

import java.util.Map;

import static utilities.ElementClass.$;

public class UserStory10 extends ParentClass {
    @When("^User navigate to Locations page$")
    public void user_navigate_to_Locations_page() {
      clickOnMenuTo(NavMenu.Locations);
    }

    @Then("^User add a Locations$")
    public void user_add_a_Locations() {
    $(PageButtonAdd).shouldBe(Condition.appear).click();
    }

    @Then("^User create a Locations$")
    public void user_create_a_Locations(DataTable datatable) {
        Map<String,String>locations=datatable.asMap(String.class,String.class);
        String name=locations.get("name");
        String shortName=locations.get("shortName");
        String locationType=locations.get("locationType");
        String capacity=locations.get("capacity");
        $(DialogInputName).shouldBe(Condition.appear).setValue(name);
        $(DialogInputShortName).setValue(shortName);
        $(LocationType).selectOptionWithText(locationType);
        $(LocationsInputCapacity).setValue(capacity);
        clickToDialogButton(Buttons.Save);


    }

    @Then("^user edit the Notation Keys named as \"([^\"]*)\"$")
    public void user_edit_the_Notation_Keys_named_as(String name) {
     editTableData(name);
    }

    @Then("^user update the Notation Keys$")
    public void user_update_the_Notation_Keys(DataTable dataTable)  {
        Map<String,String>locations=dataTable.asMap(String.class,String.class);
        String name=locations.get("name");
        String shortName=locations.get("shortName");
        String locationType=locations.get("locationType");
        String capacity=locations.get("capacity");
        $(DialogInputName).shouldBe(Condition.appear).clear().setValue(name);
        $(DialogInputShortName).clear().setValue(shortName);
        $(LocationType).selectOptionWithText(locationType);
        $(LocationsInputCapacity).clear().setValue(capacity);
        clickToDialogButton(Buttons.Save);

    }

    @Then("^user delete the location named as \"([^\"]*)\"$")
    public void user_delete_the_location_named_as(String name) {
     deleteTableData(name);
    }





}
