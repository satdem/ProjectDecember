package stepdefs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pageModels.NavMenu;
import utilities.Buttons;
import utilities.Condition;
import utilities.ParentClass;
import java.util.Map;

import static utilities.ElementClass.$;


public class UserStory05Steps extends ParentClass {
  /*  By itemPerPage=By.cssSelector("div[class='mat-select-arrow ng-tns-c215-52']");
    By itemPerPageoption=By.xpath("(//mat-option[@role='option'])[9]");*/


    @When("^user navigate to Grade Levels page$")
    public void userNavigateToGradeLevelsPage() {
        clickOnMenuTo(NavMenu.GradeLevels);
    }

    @Then("^user create a grade level$")
    public void userCreateAGradeLevel(DataTable dataTable) {
        $(PageButtonAdd).shouldBe(Condition.appear).click();

        Map<String, String> map = dataTable.asMap(String.class, String.class);
        String name = map.get("name");
        String shortName = map.get("shortName");
        String order = map.get("order");
        String nextGrade = map.get("nextGrade");


        $(DialogInputName).shouldBe(Condition.visible).setValue(name);
        $(DialogInputShortName).setValue(shortName);
        $(DialogInputOrder).setValue(order);
       // $(DialogSelectNextGrade).shouldBe(Condition.visible).selectOptionWithIndex(1);
        $(DialogSelectNextGrade).shouldBe(Condition.visible).selectOptionWithText(nextGrade);
        clickToDialogButton(Buttons.Save);

    }


    @Then("^user update the grade level named as \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userUpdateTheGradeLevelNamedAsTo(String oldName, String newName)  {

       /* $(itemPerPage).click();
        $(itemPerPageoption).click();
*/
        editTableData(oldName);
        $(DialogInputName).shouldBe(Condition.appear).clear().setValue(newName);
        //$(DialogInputShortName).clear().setValue(shortName);
        clickToDialogButton(Buttons.Save);
    }

    @Then("^user delete the grade level named as \"([^\"]*)\"$")
    public void userDeleteTheGradeLevelNamedAs(String name) {

        deleteTableData(name);
    }
}
