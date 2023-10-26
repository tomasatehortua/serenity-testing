package starter.SauceDemo;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingIn {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;
    InventoryPage inventoryPage;

    @Test
    public void userCanLoginByHomePage(){
        login.as(User.STANDARD_USER);
        Serenity.reportThat( "The inventory page should include the correct text",
                () -> assertThat(
                        inventoryPage.getHeading()).isEqualToIgnoringCase("Products"
                )
        );
    }
}
