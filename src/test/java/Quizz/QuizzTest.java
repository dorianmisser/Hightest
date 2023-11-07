package Quizz;

import Pages.*;
import base.BaseTests;
import org.testng.annotations.Test;

import static Pages.HomePage.acceptCookiesAndClosePopUp;

@Test
public class QuizzTest extends BaseTests {
    public void testistqbFoundation() {

        acceptCookiesAndClosePopUp();
        ToolboxPage toolboxPage = HomePage.clickToolboxButton();
        QuestionsPage questionsPage = toolboxPage.scrollAndClickQuizIstqbFoundationfr();
        EmailSubmitPage emailSubmitPage = questionsPage.selectionReponses();
        YopMailPage yopMailPage = emailSubmitPage.inputMail();
        yopMailPage.verifMail();









    }
}
