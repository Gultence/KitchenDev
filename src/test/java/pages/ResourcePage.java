package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class ResourcePage {
    public ResourcePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath= "//*[@id=\"m_ver_menu\"]/ul/li[8]/a/i")
    public WebElement resourceIcon;

    @FindBy (xpath ="/html/body/m-pages/div/div/div/ng-component/m-resources/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/button")
    public WebElement createdLink;

    @FindBy(xpath = "//span[.=' Resources ']")
    public WebElement resourcesButton;


    @FindBy(xpath = "/html/body/m-pages/div/div/div/ng-component/m-resources/div/div[2]/div[2]/table/tbody/tr[1]/td[3]/button[2]/i")
    public WebElement editButton;

    @FindBy(xpath = " //table//tr//td[.=' 1. ']")
    public WebElement Resources1;

    @FindBy(xpath = "//div[@class='cdk-overlay-container']")
    public WebElement PopUp;

    @FindBy(xpath="(//div//input[starts-with(@id,'mat-input')])[3]")
    public WebElement LabelButton;


    @FindBy(xpath="(//div[starts-with(@id,'mat-select-value')])[2]//span")
    public WebElement Tagbutton;

    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='Custom Finish']")
    public WebElement CustomFinishButton;


    @FindBy(xpath = "//span[.='Stock']")
    public WebElement StockButton;


    @FindBy(xpath = "//button[.=' Upload File ']")
    public WebElement UploadFileButton;


    @FindBy(xpath = "//div//span[.='2020 Catalog']")
    public WebElement Catalog2020;
}
