package SelenuimAssignment;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;


    public class HomePage {

        WebDriver driver;
        public HomePage(WebDriver driver) {
            this.driver=driver;
        }

        By signIn = By.cssSelector("a[data-nav-ref='nav_ya_signin']");


        public WebElement goToSignIn(){
            return  driver.findElement(signIn);
        }
}
