import StepObject.RegistrationPageStep;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationPageData.*;

public class AltaRegistrationPageTest extends ChromeRunner {
    RegistrationPageStep registrationPageStep = new RegistrationPageStep();

        @Test
        public void positiveRegistrationCheck () {
        registrationPageStep
                .clickOnSignInRegBtn()
                .goToRegPage()
                .fillEmailInput(email)
                .fillPasswordInput(password)
                .fillConfirmPasswordInput(confirmPassword)
                .fillFirstNameInput(randomName)
                .fillLastNameInput(randomlastName)
                .clickRegistrationBtn();
        Assert.assertFalse(registrationPageStep.signUpBtn.is(Condition.enabled));
        Assert.assertTrue(registrationPageStep.seccsessfulRegistrationMessage.is(Condition.visible));
    }
    @Test
        public void negativeRegistrationCheck () {
        registrationPageStep
                .negativeClickOnSignInRegBtn()
                .negativeGoToRegPage()
                .negativeFillEmailInput(negativeEmail)
                .negativeFillPasswordInput(negativePassword)
                .negativeFillConfirmPasswordInput(negativeConfirmPassword)
                .negativeFillFirstNameInput(negativeFirstname)
                .negativeFillLastNameInput(negativeLastname)
                .negativeClickRegistrationBtn();
        Assert.assertTrue(registrationPageStep.emailErrorMessage.is(Condition.visible));
        Assert.assertTrue(registrationPageStep.confirmPasswordErrorMessage.is(Condition.visible));
        Assert.assertTrue(registrationPageStep.passwordErrorMessage.is(Condition.visible));


    }

    }