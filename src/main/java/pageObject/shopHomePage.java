package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shopHomePage {

    // Initiate WebDriver
    public WebDriver driver;

    // Grouping Web Elements
    By productOne = By.linkText("Hummingbird printed t-shirt");
    By productTwo = By.linkText("Brown bear printed sweater");
    By productThree = By.linkText("The best is yet to come' Framed poster");
    By productFour = By.linkText("The adventure begins Framed poster");
    By productFive = By.linkText("Today is a good day Framed poster");
    By productSix = By.linkText("Mug The best is yet to come");
    By productSeven = By.linkText("Mug The adventure begins");
    By productEight = By.linkText("Mug Today is a good day");


    //  Constructor
    public shopHomePage(WebDriver driver){
        this.driver = driver;
    }

    // Giving our WebElements a methods to call later
    public WebElement getProdOne(){
        return driver.findElement(productOne);
    }
    public WebElement getProdTwo(){
        return driver.findElement(productTwo);
    }
    public WebElement getProdThree(){
        return driver.findElement(productThree);
    }
    public WebElement getProdFour(){
        return driver.findElement(productFour);
    }
    public WebElement getProdFive(){
        return driver.findElement(productFive);
    }
    public WebElement getProdSix(){
        return driver.findElement(productSix);
    }
    public WebElement getProdSeven(){
        return driver.findElement(productSeven);
    }
    public WebElement getProdEight(){
        return driver.findElement(productEight);
    }
}
