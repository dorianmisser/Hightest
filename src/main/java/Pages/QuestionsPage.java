package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
public class QuestionsPage {
    private WebDriver driver;
    public QuestionsPage(WebDriver driver) {
        this.driver = driver;
    }
    public EmailSubmitPage selectionReponses(){
        // LES REPONSES SONT AJOUTEES MANUELLEMENT DANS UNE LISTE
        List<String> listeReponses = Arrays.asList("1","2","1","2","2","3","2","4","1","3","4","2","3","2","4","3","3","1","2","2");
        By submitButton = By.xpath("//input[@type='submit']");
        // LA BOUCLE PERMET DE SELECTIONNER TOUTE LES REPONSES EN FONTION D'UN NAME(N° QUESTION) ET D'UNE VALUE(REPONSE)
        for (int i=0;i<20;++i){
            By reponse = By.xpath("//input[@name='" + i + "' and @value='" + listeReponses.get(i) + "']");
            driver.findElement(reponse).click();
            String script = "window.scrollBy(0,300);";
            ((JavascriptExecutor) driver).executeScript(script);
        }
        // CLIQUER SUR LE BOUTON TERMINE !
        driver.findElement(submitButton).click();
        return new EmailSubmitPage(driver);
    }

}
