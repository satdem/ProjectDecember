package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageModels.NavMenu;
import utilities.Condition;
import utilities.ParentClass;

import static utilities.ElementClass.$;

public class UserStory11 extends ParentClass {

    @When("^User navigate to Notation Keys page$")
    public void user_navigate_to_Notation_Keys_page() {
      clickOnMenuTo(NavMenu.NotationKeys);
    }

    @Then("^User create a Notation Key name as \"([^\"]*)\" short name as \"([^\"]*)\" and multiplier as \"([^\"]*)\"$")
    public void user_create_a_Notation_Key_name_as_short_name_as_and_multiplier_as(String name, String shortName, String multiplier)  {
        $(PageButtonAdd).shouldBe(Condition.appear).click();
        $(NotationInputName).shouldBe(Condition.appear).setValue(name);
        $(NotationInputShortName).setValue(shortName);
        $(NotationInputMultiplier).setValue(multiplier);
        $(DialogContainerButtonApply).click();
    }

    @Then("^user update the Notation Keys named as \"([^\"]*)\" to \"([^\"]*)\" and short name as \"([^\"]*)\" and multiplier as \"([^\"]*)\"$")
    public void userUpdateTheNotationKeysNamedAsToAndShortNameAsAndMultiplierAs(String oldName, String newName, String shortName, String multiplier){
        editTableData(oldName);
        $(NotationInputName).shouldBe(Condition.appear).clear().setValue(newName);
        $(NotationInputShortName).clear().setValue(shortName);
        $(NotationInputMultiplier).clear().setValue(multiplier);
        $(DialogContainerButtonApply).click();

    }

    @Then("^user delete the Notation Key named as \"([^\"]*)\"$")
    public void userDeleteTheNotationKeyNamedAs(String name) {
        deleteTableData(name);

    }




}
