package StepObject;

import DataObject.RegistrationPageData;
import PageObject.RegistrationPageObject;

import static DataObject.RegistrationPageData.*;

public class RegistrationPageStep extends RegistrationPageObject {

//Positive Registration
    public RegistrationPageStep clickOnSignInRegBtn() {
        SignRegBtn.click();
        return this;
    }

    public RegistrationPageStep goToRegPage() {
        regBtn.click();
        return this;
    }

    public RegistrationPageStep fillEmailInput(String emailAddress) {
        emailInput.setValue(email);
        return this;
    }

    public RegistrationPageStep fillPasswordInput(String password) {
        passwordInput.setValue(RegistrationPageData.password);
        return this;
    }

    public RegistrationPageStep fillConfirmPasswordInput(String confirmPassword) {
        confirmPasswordInput.setValue(RegistrationPageData.confirmPassword);
        return this;
    }

    public RegistrationPageStep fillFirstNameInput(String firstName) {
        firstNameInput.setValue(RegistrationPageData.firstName);
        return this;
    }

    public RegistrationPageStep fillLastNameInput(String lastName) {
        lastNameInput.setValue(RegistrationPageData.lastName);
        return this;
    }

    public RegistrationPageStep clickRegistrationBtn() {
        signUpBtn.click();
        return this;
    }


//Negative Registration


    public RegistrationPageStep negativeClickOnSignInRegBtn() {
        SignRegBtn.click();
        return this;
    }

    public RegistrationPageStep negativeGoToRegPage() {
        regBtn.click();
        return this;
    }

    public RegistrationPageStep negativeFillEmailInput(String negativeEmailAddress) {
        emailInput.setValue(negativeEmail);
        return this;
    }
    public RegistrationPageStep negativeFillPasswordInput(String password) {
        passwordInput.setValue(negativePassword);
        return this;
    }
    public RegistrationPageStep negativeFillConfirmPasswordInput(String confirmPassword) {
        confirmPasswordInput.setValue(negativeConfirmPassword);
        return this;
    }
    public RegistrationPageStep negativeFillFirstNameInput(String firstName) {
        firstNameInput.setValue(negativeFirstname);
        return this;
    }
    public RegistrationPageStep negativeFillLastNameInput(String lastName) {
        lastNameInput.setValue(negativeLastname);
        return this;
    }
    public RegistrationPageStep negativeClickRegistrationBtn() {
        signUpBtn.click();
        return this;
    }
 /*   public RegistrationPageStep errorMessagesAssertions(){
        Assert.assertTrue(emailErrorMessage.is(Condition.visible));
        Assert.assertTrue(confirmPasswordInput.is(Condition.visible));
        Assert.assertTrue(passwordErrorMessage.is(Condition.visible));
        emailErrorMessage.shouldBe(Condition.visible);
        passwordErrorMessage.shouldBe(Condition.visible);
        confirmPasswordErrorMessage.shouldBe(Condition.visible);
        return this;
    }*/
}