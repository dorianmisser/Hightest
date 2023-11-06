package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class YopMailPage {

    private WebDriver driver;
    private By acceptCookieButtonYopmail = By.id("accept");
    private By inputLogin = By.id("login");
    private By validate = By.xpath("//div[@id='refreshbut']/button");
    private By refreshButton = By.xpath("//button[@id='refresh']");
    private By deleteButton = By.xpath(("//button[@onclick='w.suppr_mail();']"));
    private By result = By.xpath("//div[contains(text(),'Vous avez bien')]");

    public YopMailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifMail() {
        // SE RENDRE SUR LE SITE INTERNET DE YOPMAIL
        driver.get("https://yopmail.com/fr/wm");
        // ACCEPTER LES COOKIES
        driver.findElement(acceptCookieButtonYopmail).click();
        // ENTRER LE LOGIN DU MAIL
        driver.findElement(inputLogin).sendKeys("dodorigan", Keys.ENTER);
        // APPUYER SUR RAFRAICHIR POUR ÊTRE CERTAIN DE LA RECEPTION DU DERNIER MAIL
        driver.findElement(refreshButton).click();
        // SWITH.TO SUR L'IFRAME ACTIVE N'ETANT PAS CELLE DU CONTENU DU MAIL
        driver.switchTo().frame("ifmail");


        // VERIFICATION QUE LE SCORE EST DE 100%
        String textRequired = "Vous avez bien répondu à 20 question(s) sur 20, soit 100 % de réussite. Félicitations, vous avez obtenu le score maximal !";
        String textResult = driver.findElement(result).getText();

        if (textResult.equals(textRequired)) {
            System.out.println("Le message correspond");
        }

    }
}


