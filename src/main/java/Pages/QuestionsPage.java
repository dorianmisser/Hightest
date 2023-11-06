package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;


public class QuestionsPage {
    private WebDriver driver;
    public QuestionsPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Méthode selectionReponses() qui permet via une boucle for de générer des expaths variabilisé
     * pour cliquer sur les réponses correspondantes à la question
     */

    public EmailSubmitPage selectionReponses(){
        // Les réponses sont ajoutées manuellement dans une liste
        List<String> listeReponses = Arrays.asList("1","2","1","2","2","3","2","4","1","3","4","2","3","2","4","3","3","1","2","2");
        By submitButton = By.xpath("//input[@type='submit']");

        // La boucle permet de selectionner toute les réponses en fonction d'un name(n° question) et d'une value(réponse de 1 à 4)
        for (int i=0;i<20;++i){
            By reponse = By.xpath("//input[@name='" + i + "' and @value='" + listeReponses.get(i) + "']");
            // cliquer sur le bouton de la réponse
            driver.findElement(reponse).click();
            // Scroll de 300 pixels pour atteindre la question suivante
            String script = "window.scrollBy(0,300);";
            ((JavascriptExecutor) driver).executeScript(script);
        }

        // Cliquer sur le bouton "terminé !"
        driver.findElement(submitButton).click();
        return new EmailSubmitPage(driver);
    }

}
