package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By femaleRadioButton = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By companyNameField = By.id("Company");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationCompletedText = By.xpath("//div[@class='result']");

    public void clickOnRadioButton() {
        clickOnElement(femaleRadioButton);
    }

    public void enterFirstName(String FirstName) {
        sendTextToElement(firstNameField,FirstName);
    }

    public void enterLastName(String Lastname) {
        sendTextToElement(lastNameField,Lastname);
    }

    public void enterEmailId(String Email) {
        sendTextToElement(emailField,Email);
    }

    public void enterCompanyNameField(String CompanyName) {
        sendTextToElement(companyNameField, CompanyName);
    }

    public void enterPassword(String Password) {
        sendTextToElement(passwordField, Password);
    }

    public void enterconfirmpassword(String ConfirmPassword) {
        sendTextToElement(confirmPasswordField, ConfirmPassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String getRegistrationComplition() {
        return getTextFromElement(registrationCompletedText);
    }
}
