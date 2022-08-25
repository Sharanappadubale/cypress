package SelenuimAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


    public class LogOut {
        WebDriver driver;

        public LogOut(WebDriver driver) {
            this.driver = driver;
        }

        By signIn = By.xpath("//a[@data-csa-c-interaction-events=\"click\"]");

        By signout = By.xpath("(//a[@class=\"hmenu-item\"])[27]");


        public WebElement signIn(){return driver.findElement(signIn);}

        public WebElement signOut(){
            return driver.findElement(signout);
        }
}
