package SelenuimAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class PaymentMethod {

        WebDriver driver;

        public PaymentMethod(WebDriver driver){this.driver=driver;}

        By signIn = By.cssSelector("a[data-nav-ref='nav_youraccount_btn']");

     //   By yourAccount=By.xpath("//span[contains(text(),'Your Account')]");

        By yourPayments=By.xpath("//div[@data-card-identifier='PaymentOptions']");

       // By newAdd=By.xpath("//span[@id=\"pp-sPM7RH-61-announce\"]");

        By newAdd=By.xpath("//body/div[@id='a-page']/div[@id='walletWebsiteContainer']/div[@id='mainContentRow']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]/input[1]");

       // By cardNo=By.cssSelector("[name=addCreditCardNumber]");
        By cardNo=By.name("addCreditCardNumber");
      By nameOnCard=By.name("ppw-accountHolderName");

      By expiryDate=By.xpath("(//span[@role=\"button\"])[1]");

      By dateSelection=By.xpath("(//ul[@role=\"listbox\"]//li)[8]");

      By expiryYear=By.xpath("(//span[@role=\"button\"])[2]");

      By yearSelection=By.xpath("(//ul[@role=\"listbox\"])[2]//li[3]");

       // By nameOnCard=By.cssSelector("[name=ppw-accountHolderName]");

        By addCard=By.name("ppw-widgetEvent:AddCreditCardEvent");

        By useAddBtn=By.name("ppw-widgetEvent:SelectAddressEvent");

        By paymentAdded=By.xpath("//ul[@class=\"a-unordered-list a-nostyle a-vertical\"]");


        public WebElement signIn(){return driver.findElement(signIn);}

      // public WebElement yourAccount(){return driver.findElement(yourAccount);}

        public WebElement yourPayments(){return driver.findElement(yourPayments);}

        public WebElement newAdd(){return driver.findElement(newAdd);}

        public WebElement cardNo(){return driver.findElement(cardNo);}

        public WebElement nameOnCard(){return driver.findElement(nameOnCard);}

        public WebElement expiryDate(){return driver.findElement(expiryDate);}

        public WebElement dateSelection(){return driver.findElement(dateSelection);}

        public WebElement expiryYear(){return driver.findElement(expiryYear);}

        public WebElement yearSelection(){return driver.findElement(yearSelection);}

        public WebElement addCard(){return driver.findElement(addCard);}

        public WebElement useAddBtn(){return driver.findElement(useAddBtn);}

        public String paymentAdded(){
            String message=driver.findElement(paymentAdded).getText();
            return message;
        }
}
