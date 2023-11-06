package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WindowManager;

import java.util.concurrent.TimeUnit;


public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;

@BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        getWindowManager().goTo("https://hightest.nc/");
        driver.manage().window().maximize();
        homePage=new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

@AfterClass
    public void tearDown(){
        driver.quit();
    }
    public WindowManager getWindowManager(){
    return  new WindowManager(driver);
    }
}


