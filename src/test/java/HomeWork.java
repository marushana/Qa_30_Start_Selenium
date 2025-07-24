import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

    }

    @Test
    public void cssSelectors(){
        //byTagname
        WebElement header = wd.findElement(By.tagName("h1"));
        List<WebElement> hButtons = wd.findElements(By.tagName("a"));
        //List<WebElement> inputs = wd.findElements(By.tagName("input"));
        WebElement inputEmail = wd.findElement(By.name("email"));
        WebElement inputPassword = wd.findElement(By.name("password"));
        WebElement br = wd.findElement(By.tagName("br")); // but br is not a real element we want to reach as well as form in common
        //List<WebElement> fButtons = wd.findElements(By.tagName("button"));
        WebElement buttonLogin = wd.findElement(By.name("login"));
        WebElement buttonRegistration = wd.findElement(By.name("registration"));

    }
}
