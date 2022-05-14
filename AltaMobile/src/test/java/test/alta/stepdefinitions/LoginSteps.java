package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.LoginScreen;
import test.alta.pages.ProductsScreen;

public class LoginSteps {
    @Steps
    LoginScreen loginScreen;

    @Steps
    ProductsScreen productsScreen;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginScreen.clickIconLogin();
        loginScreen.isOnLoginPage();
    }

    @When("I input {string} and {string} on email field")
    public void iInputAndOnEmailField(String email, String password) {
        loginScreen.inputEmail(email);
        loginScreen.inputPassword(password);
    }

    @And("I click login button")
    public void clickLoginButton(){
        loginScreen.clickLoginButton();
    }

    @Then("I am on the home page")
    public void onTheHomePage(){
        productsScreen.isOnHomePage();
    }

    @Then("I am get {string} error message")
    public void iAmGetErrorMessage(String errormessage) {
        loginScreen.getErrorMessage(errormessage);
    }
}
