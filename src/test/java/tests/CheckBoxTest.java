package tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckBoxTest extends BaseTest {


    @Test
    public void singleCheckBoxTest() {

        String outputMessage = new CheckboxPage(driver).singleCheckBox();

        Assertions.assertThat(outputMessage).isEqualTo("Success - Check box is checked");
    }
}
