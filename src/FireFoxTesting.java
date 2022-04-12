import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTesting { public static void main(String[] args) {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get(baseUrl); // lunch the URL.
    driver.manage().window().maximize();// maximise window
    // We give implicit time to driver
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    // get the title of the page
    String title = driver.getTitle();
    System.out.println(title);
    // get the current url
    String url = driver.getCurrentUrl();
    System.out.println("current url " + url);
    //login url
    String loginUrl = "https://opensource-demo.orangehrmlive.com/";
    driver.navigate().to(loginUrl);
    System.out.println("login url" + loginUrl);
    //find email field element
    WebElement emailField = driver.findElement(By.id("txtUsername"));
    // sending email to email field element
    emailField.sendKeys("mittttt.pattttt@yahoo.com");
    //find password element
    WebElement passwordField = driver.findElement(By.name("txtPassword"));
    //sending password to password field element
    passwordField.sendKeys("222222");
    // close the browser
    driver.close();
}

}
