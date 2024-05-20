package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class Announcement {
    public Announcement (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//*[@id=\"m_aside_left_minimize_toggle\"]")
    public WebElement threeLine;

    @FindBy(xpath="//*[@id=\"m_ver_menu\"]/ul/li[1]")
    public WebElement dashSign;
    @FindBy(xpath = "(//span[.=' Dashboard '])[1]")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@id=\"m_ver_menu\"]/ul/li[9]/a/i")
    public WebElement announcementName;

    @FindBy(xpath="//*[@id=\"mat-input-3\"]")
    public WebElement searchBox;

    @FindBy(xpath = "/html/body/m-pages/div/div/div/ng-component/m-announcements/div/div[2]/div[2]/div/div")
    public WebElement zqText;
}
