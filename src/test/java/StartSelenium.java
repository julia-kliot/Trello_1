import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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
      WebElement element = wd.findElement(By.tagName("a"));
      WebElement a = wd.findElement(By.cssSelector("a"));
      List<WebElement> a1 = wd.findElements(By.tagName("a"));
      System.out.println(a1.size());

      wd.findElement(By.className(""));
      // wd.findElement(By.id(""));
      // wd.findElement(By.tagName(""));
     // wd.findElement(By.partialLinkText("LO"));
      //wd.findElement(By.linkText("HOME"));

wd.findElement(By.cssSelector(".navbar py-3"));
wd.findElement(By.cssSelector("#hero"));
wd.findElement(By.cssSelector(""));
wd.findElement(By.cssSelector("[placeholder='Электронная почта']"));
wd.findElement(By.cssSelector("input[name='email']"));

      wd.findElement(By.linkText("HOME"));
      wd.findElement(By.cssSelector("[href]"));
      wd.findElement(By.cssSelector("[href='/login']"));

      wd.findElement(By.cssSelector("[href ^='/lo']"));//start
      wd.findElement(By.cssSelector("[href $='in']"));//end
      wd.findElement(By.cssSelector("[href *='ogi']"));//contains

  }
  @AfterMethod
    public void  postconditions(){

  }
}
