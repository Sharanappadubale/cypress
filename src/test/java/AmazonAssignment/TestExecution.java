package AmazonAssignment;

import SelenuimAssignment.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestExecution {
    public WebDriver driver;
    Properties prop = new Properties();
    FileInputStream fis;


    {
        try {
            fis = new FileInputStream("/home/shad/AmazonAssignment/AmazonAssignment/src/main/resources/data.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    @Test(priority = 1)
    public void launch() throws IOException, InterruptedException {
        prop.load(fis);
        System.setProperty("webdriver.chrome.driver", "/home/shad/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(prop.getProperty("url"));
        HomePage homePage = new HomePage(driver);
        homePage.goToSignIn().click();

    }

    @Test(priority = 2)
    public void loginPage() throws IOException {
        prop.load(fis);
        LogInPage loginPage = new LogInPage(driver);
        loginPage.emailId().sendKeys(prop.getProperty("mobileNum"));
        loginPage.ContinueBtn().click();
        loginPage.sendPassWord().sendKeys(prop.getProperty("passWord"));
        loginPage.SignIn().click();
    }

    @Test(priority = 3)
    public void searchingMobiles() throws InterruptedException {


        SearchForMobiles search = new SearchForMobiles(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        search.searching();

        PrimeCheckBox primeCheckBox = new PrimeCheckBox(driver);
        primeCheckBox.checkBox().click();
        String k = primeCheckBox.details();
        System.out.println(k);
    }

    @Test(priority = 4)
    public void goToOrders() {
        GoToOrders goToOrders = new GoToOrders(driver);
        goToOrders.orders().click();
        goToOrders.duration().click();
        goToOrders.lastYear().click();
    }

    @Test(priority = 6)
    public void addNewAddress() throws IOException, InterruptedException {
        String s = "Address saved";
        prop.load(fis);
        NewAddress newAddress = new NewAddress(driver);
        newAddress.signIn().click();
        newAddress.yourAddress().click();
        newAddress.newAdd().click();
        newAddress.name().sendKeys(prop.getProperty("name"));
        newAddress.phoneNo().sendKeys(prop.getProperty("phoneNo"));
        Thread.sleep(3000);
        newAddress.pinCode().sendKeys(prop.getProperty("pinCode"));
        newAddress.houseNo().sendKeys(prop.getProperty("houseNo"));
        newAddress.street().sendKeys(prop.getProperty("street"));
        newAddress.landMark().sendKeys(prop.getProperty("landMark"));
        newAddress.city().sendKeys(prop.getProperty("city"));
        newAddress.state().click();
        Thread.sleep(5000);
        newAddress.stateselection().click();
        Thread.sleep(5000);
        newAddress.addAddress().click();
        Thread.sleep(5000);
        Assert.assertTrue(s.equalsIgnoreCase(newAddress.verifyAddress()));
        LogOut logOut = new LogOut(driver);
        logOut.signIn().click();
        Thread.sleep(5000);
        logOut.signOut().click();
        loginPage();
    }

    @Test(priority = 5)
    public void addNewPayment() throws IOException, InterruptedException {
        String s = "Payment method added";
        prop.load(fis);
        PaymentMethod paymentMethod = new PaymentMethod(driver);
        paymentMethod.signIn().click();
        paymentMethod.yourPayments().click();
        paymentMethod.newAdd().click();
        Thread.sleep(7000);
        driver.switchTo().frame(driver.findElement(By.className("apx-secure-iframe")));
        paymentMethod.cardNo().sendKeys(prop.getProperty("cardNo"));
        paymentMethod.nameOnCard().sendKeys(prop.getProperty("nameOnCard"));
        paymentMethod.expiryDate().click();
        Thread.sleep(5000);
        paymentMethod.dateSelection().click();
        paymentMethod.expiryYear().click();
        paymentMethod.yearSelection().click();
        paymentMethod.addCard().click();
        paymentMethod.useAddBtn().click();
        Assert.assertTrue(s.equalsIgnoreCase(paymentMethod.paymentAdded()));

    }
}