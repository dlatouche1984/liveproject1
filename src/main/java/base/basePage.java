package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//This is the base page which will be reused for all tests

public class basePage {
    public static WebDriver driver;
    private String url;
    private Properties prop;

    public basePage() throws IOException {
        prop = new Properties();
        FileInputStream data = new FileInputStream("/Users/plakata/IdeaProjects/liveproject1/src/main/resources/config.properties");
        prop.load(data);

    }

    public WebDriver getDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;
    }

    public String getUrl() throws IOException {
        url = prop.getProperty("url");
        return url;

    }
    public  WebElement getCookie() throws IOException {
        this.driver = getDriver();
        return null;
    }
}
