package starter.SauceDemo;

import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class LoginActions extends UIInteractions {

    public void as(User user){
        openUrl("https://saucedemo.com");

        find(By.cssSelector("[data-test='username']")).sendKeys(user.getUsername());
        find(By.cssSelector("[data-test='password']")).sendKeys(user.getPassword());
        find(By.cssSelector("[data-test='login-button']")).click();
    }
}
