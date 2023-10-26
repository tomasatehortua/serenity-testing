package starter.SauceDemo;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InventoryPage extends PageObject {

    public String getHeading(){
        return find(By.cssSelector(".title")).getText();
    }

}
