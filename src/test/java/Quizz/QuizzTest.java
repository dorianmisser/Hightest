package Quizz;

import Pages.*;
import base.BaseTests;
import org.testng.annotations.Test;

@Test
public class QuizzTest extends BaseTests {
    public void testistqbFoundation() {
        ToolboxPage toolboxPage = HomePage.clickToolboxButton();
        QuestionsPage questionsPage = toolboxPage.scrollAndClickQuizIstqbFoundationfr();
        EmailSubmitPage emailSubmitPage = questionsPage.selectionReponses();
        YopMailPage yopMailPage = emailSubmitPage.inputMail();
        yopMailPage.verifMail();









    }
}
