package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.name("email");
    By telephone = By.name("telephone");
    By password = By.name("password");
    By confirmPassword = By.name("confirm");
    By newsletter = By.name("newsletter");
    By privacyPolicy = By.name("agree");
    By continueAfterPrivacyButton = By.xpath("//input[@type='submit']");

    public void sendFirstName(String inputFirstName) {
        sendTextToElement(firstName, inputFirstName);
    }

    public void sendLastName(String inputLastName) {
        sendTextToElement(lastName, inputLastName);
    }

    public void sendEmail(String text) {

        sendTextToElement(email, text + getRandomEmail());
    }

    public void sendTelephone(String inputTelephone) {
        sendTextToElement(telephone, inputTelephone);
    }

    public void sendPassword(String inputPassword) {
        sendTextToElement(password, inputPassword);
    }

    public void sendConfirmPassword(String inputConfirmPassword) {
        sendTextToElement(confirmPassword, inputConfirmPassword);
    }

    public void clickOnSubscribeToNewsletter() {
        clickOnTheElement(newsletter);
    }

    public void clickOnPrivacyPolicy() {
        clickOnTheElement(privacyPolicy);
    }

    public void clickOnContinueAfterPrivacyButton() {
        clickOnTheElement(continueAfterPrivacyButton);
    }
}
