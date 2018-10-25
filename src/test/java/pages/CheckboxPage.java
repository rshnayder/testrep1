package pages;

import javafx.scene.web.WebView;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxPage extends BasePage{

    public CheckboxPage(WebDriver driver) {
        super(driver, "https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }


    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckBox;

    @FindBy(id = "txtAge")
    private WebElement ageText;

    public String singleCheckBox() {
        singleCheckBox.click();
        return ageText.getText();
    }
}
