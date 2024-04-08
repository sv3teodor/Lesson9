import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Tests extends BaseTest {

    @Test
    @DisplayName("Задание 1. Проверка чекбоксов")
    public void checkBoxesTest() {
        int targetCheckBox = 0;
        homePage.clickCheckBoxesLink()
                .clickCheckBox(targetCheckBox)
                .check()
                .checkBoxIsVisible(targetCheckBox)
                .checkCheckBoxIsChecked(targetCheckBox);
    }

    @Test
    @DisplayName("Задание 2. Проверка dropdown")
    public void dropDownTest() {
        int itemNumber = 1;
        homePage.clickDropdownLink()
                .selectOptions(itemNumber)
                .check()
                .dropdownCheckIsVisible()
                .dropdownCheckText(String.format("Option %s", itemNumber));
    }


    @DisplayName("Задание 3. Проверка Disappearing Elements")
    @RepeatedTest(10)
    public void disappearingElementsTest() {
        homePage.clickDisappearingElementsLink()
                .check()
                .checkSize(5);
    }

    @Test
    @DisplayName("Задание 4. Проверка Inputs")
    public void inputsTest() {
        String testString = "123456789";
        homePage.clickInputsLink()
                .check()
                .inputCheckIsEditable()
                .page()
                .sendString(testString)
                .check()
                .inputCheckIsVisible()
                .checkAttributes("value", testString);
    }


}
