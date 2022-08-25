package SelenuimAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

    public class SearchForMobiles {

        WebDriver driver;

        public SearchForMobiles(WebDriver driver) {
            this.driver = driver;
        }

        By search = By.xpath("//input[@id='twotabsearchtextbox']");

        //By lastElement = By.xpath("(//div[@class=\"sg-col-inner\"])[116]");
        By lastElement = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[26]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]");
        public void searching() {
            WebElement e = driver.findElement(search);
            e.sendKeys("Mobiles");
            e.sendKeys(Keys.ENTER);
        }

        public String lastElement() {
            String s = driver.findElement(lastElement).getText();
            return s;


        }
    }