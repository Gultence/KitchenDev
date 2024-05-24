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


    @FindBy(xpath = "/html/body/m-pages/div/div/div/ng-component/m-resources/div/div[2]/div[2]/table/tbody/tr[1]/td[3]/button[2]/i")
    public WebElement editButton;


    @FindBy(xpath = "//div[@class='cdk-overlay-container']")
    public WebElement PopUp;

    @FindBy(xpath="//div//input[@placeholder='Label']")
    public WebElement LabelButton;



    @FindBy(xpath = "//button[.='Save']")
    public WebElement saveButton;


}
