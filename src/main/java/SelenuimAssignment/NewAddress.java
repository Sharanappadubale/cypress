package SelenuimAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class NewAddress {

        WebDriver driver;

        public NewAddress(WebDriver driver){this.driver=driver;}


        By signIn = By.cssSelector("a[data-nav-ref='nav_youraccount_btn']");

      //  By yourAccount=By.xpath("//span[contains(text(),'Your Account')]");

        By yourAddress=By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]");
       // By newAdd=By.xpath("//div[@id='ya-myab-plus-address-icon']");
        By newAdd=By.xpath("//div[@id='ya-myab-plus-address-icon']");

        By name=By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']");

        By phoneNo=By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']");

        By pinCode=By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']");

        By houseNo=By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']");

        By street=By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']");

        By landMark=By.xpath("//input[@id='address-ui-widgets-landmark']");


        By city=By.xpath("//input[@id='address-ui-widgets-enterAddressCity']");

        By state=By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[2]/form[1]/span[1]/div[1]/div[7]/div[1]/div[15]/div[2]/div[2]/span[1]/span[1]/span[1]/span[1]");

        By stateselection=By.xpath("//a[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_20']");

        By addAddress=By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[2]/form[1]/span[1]/div[1]/span[3]/span[1]/span[1]/input[1]");

       By verifyAddress=By.xpath("//h4[contains(text(),'Address saved')]");
        public WebElement signIn(){
            return driver.findElement(signIn);
        }

        public WebElement yourAddress(){return driver.findElement(yourAddress);}

        public WebElement newAdd(){return driver.findElement(newAdd);}

        public WebElement name(){return driver.findElement(name);}

        public WebElement phoneNo(){return driver.findElement(phoneNo);}

       public WebElement pinCode(){return driver.findElement(pinCode);}

        public WebElement houseNo(){return driver.findElement(houseNo);}

        public WebElement street(){return driver.findElement(street);}

        public WebElement landMark(){return driver.findElement(landMark);}

        public WebElement city(){return driver.findElement(city);}

        public WebElement state(){return driver.findElement(state);}

        public WebElement stateselection(){return driver.findElement(stateselection);}


        public WebElement addAddress(){return driver.findElement(addAddress);}

        public String verifyAddress(){
            String message=driver.findElement(verifyAddress).getText();
            return message;
        }
}
