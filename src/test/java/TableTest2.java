import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TableTest2 {


    WebDriver wd;

    @BeforeMethod
    public void prec() {
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\Documents\\QA\\QA_Automation\\QA\\Trello_1\\chromedriver.exe");
        wd.navigate().to("https://www.w3schools.com/css/css_table_size.asp");
    }

    @Test
    public void tableTestCss() {
        // List<WebElement> elements = wd.findElements(By.cssSelector("table tr:nth-child(5)"));


        //

        //Assert.assertEquals(text, "");
        //Assert.assertTrue(true);
    }
        @Test
        public void table2() {


            WebElement el;
            el = wd.findElement(By.cssSelector("tr:last-child td:first-child"));
            String text= el.getText();
            System.out.println(text);

            Assert.assertEquals(text, "Joe");
           // Assert.assertTrue(text.contains("o"));
        }





    @AfterMethod
    public void tearDown() {
        //wd.quit();
    }
}




