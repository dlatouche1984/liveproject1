package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


// This page will list elements we need for the HomePage test

public class homePage {

    // initiate the WebDriver
    public WebDriver driver;

    //  We create all WebElements for the homepage to make it easier to refer too

    By toggle = By.cssSelector(".toggle");
    By homepage_Link = By.linkText("Homepage");
    By accordion = By.cssSelector("Accordion");
    By browser_Tabs = By.linkText("Browser Tabs");
    By buttons = By.linkText("Buttons");
    By calculator = By.linkText("Calculator (JS)");
    By contact_Us = By.linkText("Contact Us Form Test");
    By date_Picker = By.linkText("Date Picker");
    By dropdown_Checkbox_Radio = By.cssSelector("a[href='dropdown.html']");
    By file_Upload = By.cssSelector("a[href='fileupload.html']");
    By hidden_Elements = By.cssSelector("a[href='hiddenElements.html']");
    By iframes = By.cssSelector("a[href='iframes.html']");
    By loader = By.cssSelector("a[href='loader.html']");
    By loader_Two = By.cssSelector("a[href='loadertwo.html']");
    By login_Portal_test = By.cssSelector("a[href='loginPortal.html']");
    By mouse_Movement = By.cssSelector("a[href='mouse.html']");
    By pop_Up_Alerts = By.cssSelector("a[href='popups.html']");
    By predictive_Search = By.cssSelector("a[href='predictive.html']");
    By tables = By.cssSelector("a[href='tables.html']");
    By test_Store = By.linkText("Test Store");
    By about_Me = By.cssSelector("a[href='aboutMe.html']");


    // Create a homePage constructor - We initiate the WebDriver and call it driver -
    public homePage(WebDriver driver){
        this.driver = driver;
    }


    // We use the driver  to create WebElement METHODS so that we can call for any Test

    public WebElement getToggle(){
        return driver.findElement(toggle);
    }
    public WebElement homePage_Link(){
        return driver.findElement(homepage_Link);
    }
    public WebElement accordion() {
        return driver.findElement(accordion);
    }
    public WebElement browser_Tabs() {return driver.findElement(browser_Tabs);}
    public WebElement buttons() {
        return driver.findElement(buttons);
    }
    public WebElement calculator() {
        return driver.findElement(calculator);
    }
    public WebElement contact_Us() {
        return driver.findElement(contact_Us);
    }
    public WebElement date_Picker() {return driver.findElement(date_Picker);}
    public WebElement dropdown_Checkbox_Radio() {
        return driver.findElement(dropdown_Checkbox_Radio);
    }
    public WebElement file_Upload() {
        return driver.findElement(file_Upload);
    }
    public WebElement hidden_Elements() {
        return driver.findElement(hidden_Elements);
    }
    public WebElement iframes() {
        return driver.findElement(iframes);
    }
    public WebElement loader() {
        return driver.findElement(loader);
    }
    public WebElement loader_Two() {
        return driver.findElement(loader_Two);
    }
    public WebElement login_Portal_test() {
        return driver.findElement(login_Portal_test);
    }
    public WebElement mouse_Movement() {
        return driver.findElement(mouse_Movement);
    }
    public WebElement pop_Up_Alerts() {
        return driver.findElement(pop_Up_Alerts);
    }
    public WebElement predictive_Search() {
        return driver.findElement(predictive_Search);
    }
    public WebElement tables() {return driver.findElement(tables);}
    public WebElement test_Store() {
        return driver.findElement(test_Store);
    }
    public WebElement about_Me() {
        return driver.findElement(about_Me);
    }
}


