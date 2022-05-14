package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class ProductsScreen extends BasePageObject {
    private By tombolBeli(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }

    private By Cart(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }

    @Step
    public boolean isOnHomePage(){
        return waitUntilVisible(tombolBeli()).isDisplayed();
    }

    @Step
    public boolean validateCart() {
       return waitUntilVisible(Cart()).isDisplayed();
    }

    @Step
    public void clickTombolBeli() {
        onClick(tombolBeli());
    }
}
