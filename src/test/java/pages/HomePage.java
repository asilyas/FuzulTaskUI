package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {


    @FindBy(xpath = "//input[@id=\"outlined-basic\" and @max=\"150000\"]")
    public WebElement max;

    @FindBy(xpath = "//div[@class=\"MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-h93ljk-MuiTypography-root\"]")
    public List<WebElement> title;

    @FindBy(id = ":r0:")
    public WebElement searchBar;

    @FindBy(xpath = "//input[@id=\"outlined-basic\" and @min=\"0\"]")
    public WebElement min;


    @FindBy(xpath = "//p[contains(text(), \"Fiyatı\")]")
    public List<WebElement> price;

    @FindBy(xpath = "//input[@value=\"1\"]")
    public WebElement satilik;

    @FindBy(xpath = "//input[@value=\"2\"]")
    public WebElement kiralik;

    @FindBy(xpath = "//input[@value=\"3\"]")
    public WebElement gunluk;


    @FindBy(xpath = "//p[contains(text(), \"Satılık\")]")
    public List<WebElement> satilikList;

    @FindBy(xpath = "//p[contains(text(), \"Kiralık\")]")
    public List<WebElement> kiralikList;


    @FindBy(xpath = "//p[contains(text(), \"Günlük\")]")
    public List<WebElement> gunlukList;

    @FindBy(xpath = "//p[contains(text(), \"1 + 1\")]")
    public List<WebElement> birartibirList;
    @FindBy(xpath = "//p[contains(text(), \"2 + 1\")]")
    public List<WebElement> ikiartibirList;
    @FindBy(xpath = "//p[contains(text(), \"3 + 1\")]")
    public List<WebElement> ucartibirList;
    @FindBy(xpath = "//p[contains(text(), \"3 + 2\")]")
    public List<WebElement> ucartiikiList;
    @FindBy(xpath = "//p[contains(text(), \"4 + 2\")]")
    public List<WebElement> dortartiikiList;


    @FindBy(xpath = "//input[@value=\"7\"]")
    public WebElement birartibir;
    @FindBy(xpath = "//input[@value=\"8\"]")
    public WebElement ikiartibir;
    @FindBy(xpath = "//input[@value=\"9\"]")
    public WebElement ucartibir;
    @FindBy(xpath = "//input[@value=\"10\"]")
    public WebElement ucartiiki;
    @FindBy(xpath = "//input[@value=\"11\"]")
    public WebElement dortartiiki;


}

