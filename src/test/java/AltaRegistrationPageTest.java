import StepObject.RegistrationPageStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationPageData.*;

public class AltaRegistrationPageTest extends ChromeRunner {
    RegistrationPageStep registrationPageStep = new RegistrationPageStep();
    @Test
    public void positiveRegistrationCheck(){
        registrationPageStep
                .clickOnSignInRegBtn()
                .goToRegPage()
                .fillEmailInput(email)
                .fillPasswordInput("123456")
                .fillConfirmPasswordInput("123456")
                .fillFirstNameInput(randomName)
                .fillLastNameInput(randomlastName);
        Assert.assertTrue(registrationPageStep.signUpBtn.is(Condition.enabled));
    }
    @Test
    public void negativeRegistrationCheck(){
        registrationPageStep
                .negativeClickOnSignInRegBtn()
                .negativeGoToRegPage()
                .negativeFillEmailInput(negativeEmail)
                .negativeFillPasswordInput(negativePassword)
                .negativeFillFirstNameInput(negativeFirstname)
                .negativeFillLastNameInput(negativeLastname)
                .negativeClickRegistrationBtn();
        Assert.assertTrue(registrationPageStep.emailErrorMessage.is(Condition.visible));
        Assert.assertTrue(registrationPageStep.confirmPasswordErrorMessage.is(Condition.visible));
        Assert.assertTrue(registrationPageStep.passwordErrorMessage.is(Condition.visible));



    }
}
