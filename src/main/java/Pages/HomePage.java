package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Cette classe concernent la page d'accueil du site internet
 * acceptCookiesButton - localisation par id du bouton d'acceptation des cookies
 * closePopupButton - localisation par xpath du bouton de fermeture de la PopUp d'inscription à la newsletter
 * toolboxButton - Localisation par xpath du lien de l'onglet "Toolbox" dans la barre de menu
 */

public class HomePage {
    private static WebDriver driver;

    private static By acceptCookiesButton = By.id("cookie_action_close_header");

    private static By closePopupButton = By.xpath("//button[@class='pum-close popmake-close']");

    private static By toolboxButton = By.xpath("//a[@href='https://hightest.nc/toolbox/']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void acceptCookiesAndClosePopUp(){

        // Fermer la fenêtre des cookies
        driver.findElement(acceptCookiesButton).click();

        // Fermer la Pop-up d'inscription à la newsletter si elle apparait
        Boolean isPresent = driver.findElements(closePopupButton).size() > 0;
        if (isPresent) {
            driver.findElement(closePopupButton).click();
        }
    }


    public static ToolboxPage clickToolboxButton(){

        acceptCookiesAndClosePopUp();
        // CLIQUER SUR L'ONGLET "TOOLBOX"
        driver.findElement(toolboxButton).click();
        return new ToolboxPage(driver);
    }
}