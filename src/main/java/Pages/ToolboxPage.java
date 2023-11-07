package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * boutonQuizzIstqbFoudationFr - Localisation par xpath du bouton de l'ISTQB Fondation en Français
 *
 *
 */

public class ToolboxPage {

    private WebDriver driver;
    private By boutonQuizzIstqbFoundationFr = By.xpath("//a[@href='https://hightest.nc/ressources/test-istqb.php']");

    public ToolboxPage(WebDriver driver) {this.driver = driver;}

    public QuestionsPage scrollAndClickQuizIstqbFoundationfr() {
        WebElement quizz = driver.findElement(boutonQuizzIstqbFoundationFr);
        String script = "window.scrollBy(0,1000);";
        ((JavascriptExecutor) driver).executeScript(script, quizz);
        driver.findElement(boutonQuizzIstqbFoundationFr).click();
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return new QuestionsPage(driver);
    }
}
