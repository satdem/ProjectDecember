package stepdefs;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.ParentClass;

import static utilities.ElementClass.$;

public class UserStory04Steps extends ParentClass {
    @When("^User navigate to Discount page$")
    public void user_navigate_to_Discount_page()  {
        clickOnMenuTo(NavMenu.Discounts);
    }

    @Then("^User create a Discount description as \"([^\"]*)\"  integration code as \"([^\"]*)\"$")
    public void userCreateADiscountDescriptionAsIntegrationCodeAs(String description, String integration) {
        $(PageButtonAdd).shouldBe(Condition.appear).click();
        $(DialogInputDescription).setValue(description);
        $(DialogInputIntegrationCode2).setValue(integration);
        clickToDialogButton(Buttons.Save);
    }

    @Given("^Navigate to Discount page$")
    public void navigate_to_Discount_page() {
        clickOnMenuTo(NavMenu.Discounts);
    }

    @Then("^User update  Discount name as \"([^\"]*)\" to name as \"([^\"]*)\"  integration code as \"([^\"]*)\"$")
    public void userUpdateDiscountNameAsToNameAsIntegrationCodeAs(String oldDescription, String description, String integration)  {
        editTableData(oldDescription);
        $(DialogInputDescription).clear().setValue(description);
        $(DialogInputIntegrationCode2).clear().setValue(integration);
        clickToDialogButton(Buttons.Save);
    }

    @Given("^User Navigate to Discount page$")
    public void user_Navigate_to_Discount_page() {
        clickOnMenuTo(NavMenu.Discounts);

    }
    @Then("^User delete the discount \"([^\"]*)\"$")
    public void userDeleteTheDiscount(String discount){
        deleteTableData(discount);
    }



}
