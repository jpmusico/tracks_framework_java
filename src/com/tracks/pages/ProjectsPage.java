package com.tracks.pages;

import com.tracks.model.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsPage extends PageBase {

    @FindBy(xpath = ".//*[@id='project_name']")
        private WebElement NewName;

    @FindBy(xpath=".//*[@id='project_description']")
        private WebElement NewDescription;

    @FindBy(xpath=".//*[@id='project_new_project_submit']")
        private WebElement NewAdd;


    public ProjectsPage(WebDriver driver){
        this.driver = driver;
    }

    public void Navigate(){
        driver.get("http://192.168.0.6:8080/projects");
    }

    public void Add( String name, String note){
        NewName.sendKeys(name);
        NewDescription.sendKeys(note);
        NewAdd.click();
    }
}
