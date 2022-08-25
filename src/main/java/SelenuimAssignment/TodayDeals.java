package SelenuimAssignment;


    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class TodayDeals {

        WebDriver driver;

        public TodayDeals(WebDriver driver){
            this.driver=driver;
        }

        By todayDeals = By.xpath("//a[contains(text(),\"Today's Deals\")]");


        public WebElement TodayDeals() {
            return driver.findElement(todayDeals);
        }
}
