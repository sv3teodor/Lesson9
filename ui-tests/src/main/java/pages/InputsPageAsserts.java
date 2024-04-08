package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;

import static com.codeborne.selenide.Condition.editable;
import static com.codeborne.selenide.Condition.visible;

public class InputsPageAsserts extends AbstractAssert<InputsPageAsserts, InputsPage> {

    protected InputsPageAsserts(InputsPage actual) {
        super(actual, InputsPageAsserts.class);
    }

    public static InputsPageAsserts assertThat(InputsPage actual) {
        return new InputsPageAsserts(actual);
    }

    public InputsPage page() {
        return actual;
    }


    @Step("Проверка аттрибута")
    public InputsPageAsserts checkAttributes(String attribName, String targetValue) {
        actual.input
                .as("Значение аттрибута" + attribName + " не соответствует ожидаемому" + targetValue)
                .should(Condition.attribute(attribName, targetValue));
        return this;
    }

    @Step("Проверка видимости input")
    public InputsPageAsserts inputCheckIsVisible() {
        actual.input.should(visible);
        return this;
    }

    @Step("Проверка возможности ввода в  input")
    public InputsPageAsserts inputCheckIsEditable() {
        actual.input.should(editable);
        return this;
    }

}
