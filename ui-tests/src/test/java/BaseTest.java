import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.HomePage;
import utils.UiProperites;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    HomePage homePage;
    UiProperites prop = ConfigFactory.create(UiProperites.class);

    @BeforeAll
    @Step("Базовая инициализация")
    static void setBaseParam() {
        Configuration.remote = "http://158.160.160.185:4444/wd/hub";
        //Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.browserVersion = "120";

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @AfterAll
    @Step("Закрываем браузер")
    public static void tearDown() {
        closeWebDriver();
    }


    @BeforeEach
    @Step("Открываем базовую страницу")
    void init() {
        Selenide.open(prop.baseUrl());
        homePage = new HomePage();
    }

}
