package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class DealerPage {
    public DealerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[@id=\"m_ver_menu\"]/ul/li[2]/a/i")
    public WebElement dealerIcon;

    @FindBy(xpath="//button[contains(.,'Download sample')]")
    public WebElement demoCSV;

    @FindBy(xpath="//button[contains(.,'CSV')]")
    public WebElement iconCSV;

    @FindBy(xpath="/html/body/m-pages/div/div/div/ng-component/m-dealers-index/div/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]")
    public WebElement displayDropDown;
    //@FindBy (xpath="//span[starts-with(.,'Id, Name, Users, Proposals')])[1]")
    // public WebElement displayDropDown;

    @FindBy(xpath="(//button[contains(.,'Upload')])[2]")
    public WebElement uploadButton;


    @FindBy(css="input[accept='.csv']")
    public WebElement chooseFile;

    @FindBy(xpath="//span[@class='mat-option-text'][1]")
    public WebElement idInDropDownList;

    @FindBy(xpath="/html/body/m-pages/div/div/div/ng-component/m-dealers-index/div/div[2]/div[3]/table/thead/tr/th[1]/div/div[1]")
    public WebElement idOnTable;


}
