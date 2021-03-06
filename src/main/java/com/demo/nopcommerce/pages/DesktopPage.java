package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.uitility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {


    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    public String getDesktopPageNavigationText(){

        log.info("Navigate to desktop page and verify navigated page welcome text "+ desktopText.toString());
        return desktopText.getText();
    }}
