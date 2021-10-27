package com.qa.web;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BoardDeletion extends TestBase {
    {
        int bordCountBeforeDeletion= getBordCount();
        //click on FirsBoard
        ClickOnfirstBoard();
        openSideBoardMenu();
        openMore();
        closeBoard();

        returnToHomePage();
        int bordCountAfterDeletion= getBordCount();
        Assert.assertEquals(bordCountAfterDeletion, bordCountBeforeDeletion-1);
    }

}


