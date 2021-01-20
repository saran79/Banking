package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")
    private WebElement logo;
    @FindBy(name = "uid")
    private WebElement userNameFld;
    @FindBy(name = "password")
    private WebElement passwordFld;
    @FindBy(name = "btnLogin")
    private WebElement loginBtn;
    @FindBy(xpath = "/html/body/div[2]/h2")
    private WebElement loginText;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean validateLogo() {
        return logo.isDisplayed();
    }

    public void setUserName(String userName) {
     userNameFld.sendKeys(userName);
    }

    public void setPassword(String password) {
        passwordFld.sendKeys(password);
    }

    public void clkLogin() {
        loginBtn.click();
    }

    public String getLoginText() {
        System.out.println(loginText.getText());
       return loginText.getText();
    }
}
