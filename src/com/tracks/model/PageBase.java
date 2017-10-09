package com.tracks.model;

import com.tracks.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class PageBase extends TestBase{
    public LoginPage loginPage(){
        return PageFactory.initElements(driver, LoginPage.class);
    }

}
