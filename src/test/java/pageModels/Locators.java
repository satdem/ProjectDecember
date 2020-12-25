package pageModels;

import org.openqa.selenium.By;

public interface Locators {

    // Homepage Locators
    By LoginButton = By.id("login");
    By LoginPageUserName = By.cssSelector("input[formcontrolname='username']");
    By LoginPagePassword = By.cssSelector("input[formcontrolname='password']");
    By LoginPageSubmitButton =  By.cssSelector("button.submit-button");
    By CookieDialogBox = By.cssSelector("div[role='dialog']");
    By CookieDialogButton = By.partialLinkText("Got it");

    // Dialog locators
    By DialogContainer = By.tagName("mat-dialog-container");
    By DialogContainerButtonClose = By.cssSelector("button[aria-label='Close dialog']");
    By DialogContainerButtonSave = By.cssSelector("mat-dialog-container ms-save-button");
    By DialogContainerButtonYes = By.xpath("//mat-dialog-container//*[contains(text(),'Yes')]");
    By DialogContainerButtonNo = By.xpath("//mat-dialog-container//*[contains(text(),'No')]");

    By DialogInputName = By.cssSelector("ms-text-field[formcontrolname='name']>input");
    By DialogInputShortName = By.cssSelector("ms-text-field[formcontrolname='shortName']>input");
    By DialogInputCode = By.cssSelector("ms-text-field[formcontrolname='code']>input");
    By DialogInputIntegrationCode = By.cssSelector("ms-text-field[formcontrolname='budgetAccountIntegrationCode']>input");
    By DialogInputIntegrationCode2 = By.cssSelector("ms-text-field[formcontrolname='code']>input");
    By DialogInputPriority = By.cssSelector("ms-text-field[formcontrolname='priority']");
    By DialogInputDescription = By.cssSelector("ms-text-field[formcontrolname='description']>input");
    By DialogInputDescription2 = By.cssSelector("textarea[formcontrolname='description']");
    By DialogInputOrder = By.cssSelector("ms-text-field[formcontrolname='order']>input");
    By DialogSelectNextGrade = By.cssSelector("mat-select[formcontrolname='id']");
    By DialogSelectStage = By.cssSelector("mat-select[formcontrolname='attachmentStages']");

    //   Page Locators
    By ListOfOptions = By.cssSelector("div[role='listbox'] mat-option>span");
    By PageButtonAdd = By.cssSelector("ms-add-button button");
    By PopupMessageContainer = By.xpath("//div[@id='toast-container']");
    By PageButtonSearchWithText = By.xpath("//button//*[contains(text(),'Search')]");
    By TableButtonEdit = By.cssSelector("ms-edit-button>button");
    By TableButtonDelete = By.cssSelector("ms-delete-button>button");
    By PageButtonSearch = By.cssSelector("ms-search-button button");
    By PageFormNameInput = By.cssSelector("input[data-placeholder='Name']");
    By DashBoard = By.xpath("//toolbar//*[contains(text(),'Dashboard')]");

    // Notifications and Item Categiries
    By PageSelectType = By.cssSelector("mat-select[formcontrolname='type']");
    By PageButtonSave = By.xpath("//button//span[contains(text(), 'Save')]");
    By DialogSelectUserType = By.cssSelector("input[placeholder='User Type']");

    //Dismiscal Articles Pages
    By HumainResources = By.xpath("//span[text()='Human Resources']");
    By DismissalArticles = By.xpath("//span[text()='Dismissal Articles']");

    // Notation Locaters
    By NotationInputName = By.cssSelector("input[name='name']");
    By NotationInputShortName = By.cssSelector("input[name='shortName']");
    By NotationInputMultiplier = By.cssSelector("input[name='multiplier']");
    By DialogContainerButtonApply = By.cssSelector("mat-dialog-actions button");

    // locations Locators
    By LocationsInputCapacity = By.cssSelector("ms-text-field[formcontrolname='capacity']>input");
    By LocationType =By.xpath("(//mat-select[@role='combobox'])[3]");
    By PageSearchInputName = By.cssSelector("ms-text-field[placeholder='GENERAL.FIELD.NAME']>input");
    By PageSearchInputName2 = By.cssSelector("input[data-placeholder='Name']");
    By DialogSelectAccountCode = By.cssSelector("input[formcontrolname='code']");

}
