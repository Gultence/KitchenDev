package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Driver;

public class Catalog {

    public Catalog(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/m-pages/div/m-aside-left/div/ul/li[7]/a/span" )
    public WebElement Catalog;

    @FindBy(xpath = "//*[@id=\"m_ver_menu\"]/ul/li[7]/div/ul/li[5]/a/span")
    public WebElement Files_History;


}
