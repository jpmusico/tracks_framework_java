package com.tracks.pages;

import com.tracks.model.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    @FindBy(xpath = ".//*[@id='user_login']")
            private WebElement Username;

    @FindBy(xpath=".//*[@id='user_password']")
            private WebElement Password;

    @FindBy(xpath=".//input[@name='commit']")
            private WebElement Signin;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void DoLogin(String username, String password){
        driver.get("http://192.168.0.6:8080/login");
        Username.sendKeys(username);
        Password.sendKeys(password);
        Signin.click();
    }
}
