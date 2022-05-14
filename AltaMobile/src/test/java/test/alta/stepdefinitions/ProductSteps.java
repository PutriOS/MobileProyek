package test.alta.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.ProductsScreen;

public class ProductSteps {
    @Steps
    ProductsScreen productsScreen;

    @When("I click buy button")
    public void iClickBuyButton() {
        productsScreen.clickTombolBeli();
    }

    @Then("Product Increases On Cart")
    public void productIncreasesOnCart() {
        productsScreen.validateCart();
    }
}
