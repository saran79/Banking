package functionsLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    public void closeBrowser() {
        driver.close();
    }
    public void wait(int waitTime){
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }
    public String readPropertyFiles(String key) throws Exception{
        FileInputStream inputStream = new FileInputStream(FilePaths.configFilePath);
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties.getProperty(key);
    }
}
