package AmazonAssignment;

import SelenuimAssignment.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestExecutionWithoutLogIn {
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

    @BeforeTest
    public void launch() throws IOException, InterruptedException {
        prop.load(fis);
        System.setProperty("webdriver.chrome.driver", "/home/shad/chromedriver");
        System.out.println("Before test....");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get(prop.getProperty("url"));
        //HomePage homePage = new HomePage(driver);


    }

    @Test(priority = 2)

    public void todayDeals() throws IOException {
        prop.load(fis);
        System.out.println("Priority one test....");
        TodayDeals todayDeals = new TodayDeals(driver);
        todayDeals.TodayDeals().click();
    }

    @Test(priority = 3)
    public void thirdElement() throws IOException {
        prop.load(fis);
        System.out.println("Priority two test....");
        ThirdElement thirdElement = new ThirdElement(driver);
        thirdElement.ThirdElement().click();
    }

    @Test(priority = 4)
    public void verifyCart() throws IOException, InterruptedException {
        prop.load(fis);
        String s="1";
        VerifyCart verifyCart=new VerifyCart(driver);
        verifyCart.firstElement().click();
        Thread.sleep(5000);
        verifyCart.addToCart().click();
        Thread.sleep(5000);
        verifyCart.goToCart().click();
        Thread.sleep(5000);
        String k= verifyCart.quantity();
        System.out.println(k);
        Assert.assertTrue(s.equalsIgnoreCase(verifyCart.quantity()));
    }
    @Test(priority = 5)
    public void searchingMobiles() throws InterruptedException {

        SearchForMobiles search = new SearchForMobiles(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        search.searching();
        // Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,5500)", "");
        Thread.sleep(3000);
        String details = search.lastElement();
        System.out.println(details);
        driver.navigate().back();

    }

    @AfterTest
    public void navigation() throws IOException, InterruptedException {

        Navigation navigation=new Navigation(driver);
        navigation.allMenu().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        navigation.mobiles().click();
        // Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        navigation.mainMenu().click();

    }
}