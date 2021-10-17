package com.qa.web;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase{
    @Test
    public void testBoardCreation(){
        //clickCreateByttonOnHeader
        click(By.cssSelector("[data-test-id='header-create-menu-button']"));
        //selectCreateBoard
        click(By.cssSelector("[aria-label='BoardIcon']"));//
        //fieldBoardCreationForm
        type(By.cssSelector("[data-test-id='create-board-title-input']"), "test");

        //confirmBoardCreation
click(By.cssSelector("[data-test-id='create-board-submit-button']"));
        //returnToHomePage
        //click(By.cssSelector("[data-test-id='header-home-button']"));
        //Assert
    }
}
