package SelenuimAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyCart {

    WebDriver driver;

    public VerifyCart(WebDriver driver) {
        this.driver = driver;
    }
    By firstElement= By.xpath("//body/div[@id='a-page']/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]/div[1]/div[1]/a[1]/div[1]");

   // By addToCart=By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[8]/div[2]/button[1]");

    By addToCart=By.xpath("//input[@id='add-to-cart-button']");
    By goToCart=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/form[1]/span[1]/span[1]/input[1]");

    //By quantity=By.xpath("//body/div[@id='a-page']/div[2]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[3]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[2]");
    By quantity=By.xpath("//span[@class=\"a-dropdown-prompt\"]");
    public WebElement firstElement(){return driver.findElement(firstElement);}
    public WebElement addToCart(){return driver.findElement(addToCart);}

    public WebElement goToCart(){return driver.findElement(goToCart);}

    public String quantity(){
        String message=driver.findElement(quantity).getText();
        return message;
    }

}
