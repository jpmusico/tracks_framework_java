package com.tracks.test;

import com.tracks.model.PageBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium extends PageBase{

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void CreateNewProject(){
        loginPage().DoLogin("admin","admin");
        projectsPage().Navigate();
        projectsPage().Add( "new project", "test note");
    }

}
