package starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class thirdtestcase extends PageObject {

    @Managed
    WebDriver driver;
    @Test
    public void loginfb(){
        driver.get("https://www.ejemplo.com/");
        WebElementFacade username = $(org.openqa.selenium.By.name("email"));
        username.type("correo@gmail.com");
        $(By.name("pass")).typeAndEnter("s3cr3t");
    }
}
