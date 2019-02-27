package org.fasttrackit.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {

    @FindBy(id = "search")
    private WebElement searchField;


    @FindBy(className = "search-button")
    private WebElement searchButton;

    public void search(String keyword) {
        searchField.sendKeys(keyword);
        searchButton.click();
        System.out.println("Pressed enter in search field.");
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}