package SelenuimAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThirdElement {
        WebDriver driver;

        public ThirdElement(WebDriver driver){
            this.driver=driver;
        }
        //By thirdElement=By.xpath("//body/div[@id='a-page']/div[@id='slot-15']/div[@id='slot-15']/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/a[1]/div[1]");

         By thirdElement= By.xpath("//body/div[@id='a-page']/div[@id='slot-15']/div[@id='slot-15']/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]");

        public WebElement ThirdElement() {
            return driver.findElement(thirdElement);
        }

}
