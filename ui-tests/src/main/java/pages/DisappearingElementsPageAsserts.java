package pages;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;


public class DisappearingElementsPageAsserts extends AbstractAssert<DisappearingElementsPageAsserts, DisappearingElementsPage> {

    protected DisappearingElementsPageAsserts(DisappearingElementsPage actual) {
        super(actual, DisappearingElementsPageAsserts.class);
    }

    public static DisappearingElementsPageAsserts assertThat(DisappearingElementsPage actual) {
        return new DisappearingElementsPageAsserts(actual);
    }

    public DisappearingElementsPage page() {
        return actual;
    }

    @Step("Проверка количества элементов в Disappearing Elements")
    public DisappearingElementsPageAsserts checkSize(int targetValue) {
        actual.disappearingElements.should(CollectionCondition.size(targetValue));
        return this;
    }


}
