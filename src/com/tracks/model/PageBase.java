package com.tracks.model;

import com.tracks.pages.LoginPage;
import com.tracks.pages.ProjectsPage;
import org.openqa.selenium.support.PageFactory;

public class PageBase extends TestBase{
    public LoginPage loginPage(){
        return PageFactory.initElements(driver, LoginPage.class);
    }
    public ProjectsPage projectsPage(){return PageFactory.initElements(driver, ProjectsPage.class);}
}
