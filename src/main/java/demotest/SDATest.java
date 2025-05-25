package demotest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SDATest {

    private WebDriver driver;
    @Before
 public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Disk D\\SDA kurzy\\Java\\SADFinalT1est\\src\\main\\resources\\chromedriver.exe");
driver = new ChromeDriver();


    }

    @Test
    public void sdaTest(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().fullscreen();

        // toto mi najdede na str8nce prvek a napise jmeno
        driver.findElement(By.id("name")).sendKeys("Mir");
        driver.findElement(By.id("email")).sendKeys("jedi1");

    }



}
