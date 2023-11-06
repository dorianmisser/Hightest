package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static WebDriver driver;
    private static By acceptCookiesButton = By.id("cookie_action_close_header");
    private static By closePopupButton = By.xpath("//button[@class='pum-close popmake-close']");
    private static By toolboxButton = By.xpath("//a[@href='https://hightest.nc/toolbox/']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public static ToolboxPage clickToolboxButton() {
        // FERMER LA FENETRE DES COOKIES
        driver.findElement(acceptCookiesButton).click();
        //FERMER LA POP-UP D'INSCRITPION A LA NEWSLETTER
//        driver.findElement(closePopupButton).click();
        // CLIQUER SUR L'ONGLET "TOOLBOX"
        driver.findElement(toolboxButton).click();
        return new ToolboxPage(driver);
    }
}