
package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import pageModels.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import static utilities.ElementClass.open;
import static utilities.Buttons.Yes;
import static utilities.ElementClass.$;


public class ParentClass implements Locators {

    /**
     * navigate to homepage
     */
    public void getHomePage(){
        String url = "https://test.basqar.techno.study/";
        open(url);

    }

    /**
     * this method login to the site with unoque credientals
     */
    public void login(){
        String username = "daulet2030@gmail.com";
        String password = "TechnoStudy123@";
        login(username, password);
    }

    /**
     * this method login to the site with different credentials
     * @param username username
     * @param password  password
     */
    public void login(String username, String password){

        $(LoginPageUserName).clear().setValue(username);
        $(LoginPagePassword).clear().setValue(password);
        $(LoginPageSubmitButton).click();

        if ($(CookieDialogBox).isEnabled()) {
            $(CookieDialogButton).shouldBe(Condition.enabled).click();
        }

    }


    /**
     * this method clicks to the links on left menu
     * @param page  takes varargs from PageModelNavBar enum
     */
    public static void clickOnMenuTo(NavMenu page){

        String[] linkTexts = page.getLinks();

        String strXpath = "//fuse-nav-vertical-group/div/fuse-nav-vertical-collapsable";
        for (int i=0; i<linkTexts.length; i++) {
            if (linkTexts[i].equalsIgnoreCase("dashboard"))
                strXpath = "(//span[contains(text(),'" + linkTexts[i] + "')])[1]";
            else
                strXpath += "/a/span[contains(text(),'" + linkTexts[i] + "')]";

            By by = By.xpath(strXpath);
            $(by).scrollIntoView().shouldBe(Condition.visible).click();
            strXpath += "//ancestor::fuse-nav-vertical-collapsable/";
        }
        $(By.xpath("//toolbar//*[contains(text(),'" + page.getHeader() + "')]")).shouldBe(Condition.exists);
    }


    /**
     * verify the notification as result in text
     * @param result required result text
     */
    public void verifyNotificationAs(NotificationResults result){
        boolean val =
                $(PopupMessageContainer)
                .find(By.xpath("//*[contains(text(),'" + result.toString() + "')]"))
                .shouldBe(Condition.appear)
                .getText()
                .contains(result.toString());
        Assert.assertTrue(val);
    }

    /**
     * search in text field in page
     * @param by field selector
     * @param textToSearch text to be searched
     */
    public void searchTextIn(By by, String textToSearch){
        $(by).click();
        $(by).clear().setValue(textToSearch);
        $(PageButtonSearchWithText).click();
    }


    /**
     * clicks the dialog button
     * @param button as button enum
     */
    public void clickToDialogButton(Buttons button){
        switch (button){
            case Save:
                $(DialogContainerButtonSave).shouldBe(Condition.appear).click();
                break;
            case Yes:
                $(DialogContainerButtonYes).shouldBe(Condition.appear).click();
                break;
            case No:
                $(DialogContainerButtonNo).shouldBe(Condition.appear).click();
                break;
            case Close:
                $(DialogContainerButtonClose).shouldBe(Condition.appear).click();
                break;
        }
    }


    /**
     * gets the table row of desired text
     * @param textToBeSearched  test in table row
     * @return tr as Webelement
     */
    public WebElement getTableRowWithText(String textToBeSearched){
        By byTr = By.xpath("//*[contains(text(),'" + textToBeSearched + "')]//ancestor::tr");
        return $(byTr).getElement();
    }


    /**
     * clicks the edit or delete button in table row
     * @param by selector of delete or edit button
     * @param textToSearched text in row
     */
    protected void clickToButtonInTable(By by, String textToSearched){
        WebElement row = getTableRowWithText(textToSearched);
        row.findElement(by).click();
    }


    /**
     *  delete the table data
     * @param textToBeSearched text in table row
     */
    public void deleteTableData(String textToBeSearched){
        clickToButtonInTable(TableButtonDelete, textToBeSearched);
        $(DialogContainer).shouldBe(Condition.enabled);
        clickToDialogButton(Yes);
    }


    /**
     * edit the table data
     * @param textToBeSearched text in table row
     */
    public void editTableData(String textToBeSearched){
        clickToButtonInTable(TableButtonEdit, textToBeSearched);
        $(DialogContainer).shouldBe(Condition.enabled);
    }


    /**
     * takeScreenshot
     * @param fileName fileName
     */
    public void takeScreenshot(String fileName){
        String directoryPath = "target/screenshots/";
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdir();
        }

        File file = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);

        String dt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss"));
        String filePath = directoryPath + fileName + "_" + Thread.currentThread().getName() + "_" + dt + ".png";
        try {
            FileUtils.copyFile(file, new File(filePath));
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}


