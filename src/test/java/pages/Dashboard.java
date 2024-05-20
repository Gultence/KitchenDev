package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class Dashboard {
    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="/html/head/link[1]")
    public WebElement link ;
}
