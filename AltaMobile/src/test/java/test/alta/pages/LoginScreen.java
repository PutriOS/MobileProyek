package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

    private By iconLogin(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    private By emailField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    //invalid login
    private By errorEmailMessage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    }

    private By errorMessage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");
    }

    private By errorPasswordMessage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    }

    private By headerLogin(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    @Step
    public void clickIconLogin(){
        onClick(iconLogin());
    }

    @Step
    public boolean isOnLoginPage(){
        return waitUntilVisible(headerLogin()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        onClick(emailField());
        onType(emailField(), email);
    }

    @Step
    public void inputPassword(String password){
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void clickLoginButton(){
        onClick(loginButton());
    }

    // invalid login
    @Step
    public void getErrorMessage(String errormessage){
        if (errormessage.equals("messagekosong")){
            waitUntilVisible(errorEmailMessage()).isDisplayed();
            waitUntilVisible(errorPasswordMessage()).isDisplayed();
        }else if (errormessage.equals("messagepassword")){
            waitUntilVisible(errorPasswordMessage()).isDisplayed();
        }else if(errormessage.equals("messageemail")){
            waitUntilVisible(errorEmailMessage()).isDisplayed();
        }else{
            waitUntilVisible(errorMessage()).isDisplayed();
        }
    }
}
