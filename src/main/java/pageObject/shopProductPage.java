package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shopProductPage {

    public WebDriver driver;

    By sizeDropDown = By.cssSelector("#group_1");
    By addToCart = By.cssSelector(".btn.btn-primary.add-to-cart");
    By upButton = By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.qty > div > span.input-group-btn-vertical > button.btn.btn-touchspin.js-touchspin.bootstrap-touchspin-up");
    By downButton = By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart.js-product-add-to-cart > div > div.qty > div > span.input-group-btn-vertical > button.btn.btn-touchspin.js-touchspin.bootstrap-touchspin-down");
    By colorBlack = By.cssSelector("#group_2 > li:nth-child(2) > label > input");
    By colorWhite = By.cssSelector("#group_2 > li:nth-child(2) > label > input");
    By homeTestStore = By.xpath("//*[@id=\"_desktop_logo\"]/a/img");


    public  shopProductPage(WebDriver driver){
        this.driver = driver;
    }


    public WebElement getsizeDropDown(){
        return driver.findElement((sizeDropDown));
    }
    public WebElement getaddToCart(){
        return driver.findElement((addToCart));
    }
    public WebElement getupButton(){
        return driver.findElement((upButton));
    }
    public WebElement getdownButton(){
        return driver.findElement((downButton));
    }
    public WebElement getcolorBlack(){
        return driver.findElement((colorBlack));
    }
    public WebElement getcolorWhite(){
        return driver.findElement((colorWhite));
    }
    public WebElement homeTestStore(){
        return driver.findElement((homeTestStore));
    }

}
