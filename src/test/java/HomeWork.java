import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;
    private WebElement place2;
    //private WebElement place2;

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
        List<WebElement> inputs = wd.findElements(By.tagName("input"));
        //WebElement inputEmail = wd.findElement(By.name("email"));
        //WebElement inputPassword = wd.findElement(By.name("password"));
        WebElement br = wd.findElement(By.tagName("br")); // but br is not a real element we want to reach as well as form in common
        List<WebElement> fButtons = wd.findElements(By.tagName("button"));
        //WebElement buttonLogin = wd.findElement(By.name("login"));
        //WebElement buttonRegistration = wd.findElement(By.name("registration"));


        //by class
        WebElement class1 = wd.findElement(By.className("container"));
        WebElement class2 = wd.findElement(By.cssSelector(".container"));
        WebElement class3 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement class4 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement class5 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement class6 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
        WebElement class7 = wd.findElement(By.className("active"));
        WebElement class8 = wd.findElement(By.cssSelector(".active"));
        WebElement class9 = wd.findElement(By.xpath("//*[@class='active']"));
        WebElement class10 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement class11 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement class12 =wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));


        //by id
        WebElement id1 = wd.findElement(By.id("root"));
        WebElement id2 = wd.findElement(By.cssSelector("#root"));
        WebElement id3 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute
        WebElement href1 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement href2 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement href3 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement href4 = wd.findElement(By.xpath("//*[@href='/home']"));
        WebElement href5 = wd.findElement(By.xpath("//*[@href='/about']"));
        WebElement href6 = wd.findElement(By.xpath("//*[@href='/login']"));
        WebElement aira = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement aira1 = wd.findElement(By.xpath("//*[@aria-current='page']"));
        WebElement place1 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement place5 = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        WebElement place3 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement place4 = wd.findElement(By.xpath("//*[@placeholder='Password']"));
        WebElement name1 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement name2 = wd.findElement(By.xpath("//*[@name='login']"));
        WebElement name3 = wd.findElement(By.name("login"));
        WebElement name4 = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement name5 = wd.findElement(By.xpath("//*[@name='registration']"));
        WebElement name6 = wd.findElement(By.name("registration"));

    }
}
