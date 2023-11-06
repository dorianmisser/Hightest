package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * mail -
 * submitMail -
 * inputMail -
 *
**/

public class EmailSubmitPage {
    private WebDriver driver;

    private By mail = By.id("email");

    private By submitMail = By.id("submitMail");

    public EmailSubmitPage(WebDriver driver) {
        this.driver = driver;
    }

    public YopMailPage inputMail(){
        // ENTRER UNE ADRESSE YOPMAIL POUR RECEVOIR SES RESULTATS
        driver.findElement(mail).sendKeys("dodorigan@yopmail.com");
        //
        driver.findElement(submitMail).click();

        return new YopMailPage(driver);

    }
}
