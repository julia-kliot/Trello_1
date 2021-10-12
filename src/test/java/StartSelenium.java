import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void  preconditions(){
        wd =new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\julia\\Documents\\QA\\QA_Automation\\QA\\Trello_1\\chromedriver.exe");
        wd.navigate().to("https://trello.com/");
    }
  @Test
  public  void  testName1(){

  }
  @AfterMethod
    public void  postconditions(){

  }
}
