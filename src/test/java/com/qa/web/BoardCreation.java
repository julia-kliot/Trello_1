package com.qa.web;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase {
    @Test
    public void testBoardCreation() throws InterruptedException {
        int bordCountBeforeCreation= getBordCount();
        //clickCreateByttonOnHeader
        initBoardCreationfromHeader();
        //fieldBoardCreationForm
        fillBoardCreationForm("test");
        //returnToHomePage
        Thread.sleep(15000);
        //if (isHomeButton()) {
            //click(By.cssSelector("[data-test-id='header-home-button]"));
        //} else
            //click(By.cssSelector("[href='/']"));
returnToHomePage();
        int bordCountAfterCreation= getBordCount();
        Assert.assertEquals(bordCountBeforeCreation, bordCountAfterCreation+1 );
        //Assert
    }

}
