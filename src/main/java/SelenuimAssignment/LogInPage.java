package SelenuimAssignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class LogInPage {
        WebDriver driver;

        public LogInPage(WebDriver driver) {
            this.driver = driver;
        }

        By email = By.xpath("//input[@type='email']");

        By ContinueBtn=By.xpath("//input[@id='continue']");
        By password = By.xpath("//input[@type='password']");
        By signInButton = By.xpath("//input[@id='signInSubmit']");

        public WebElement emailId(){
            return driver.findElement(email);
        }
        public WebElement ContinueBtn()
        {return driver.findElement(ContinueBtn);}
        public WebElement sendPassWord(){
            return driver.findElement(password);
        }
        public  WebElement SignIn(){
            return driver.findElement(signInButton);
        }
}
