import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.TestData;

public class BaseTest {

    @BeforeAll
    static void configure() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = TestData.baseUrl;
        Configuration.browser = TestData.browserName;
        Configuration.browserVersion = TestData.browserVersion;
        Configuration.browserSize = TestData.browserSize;

        if (TestData.remote == null || TestData.remote.equals("")) {
        } else {
            Configuration.remote = "https://"
                    + TestData.LOGIN_REMOTE + ":"
                    + TestData.PASSWORD_REMOTE + "@"
                    + TestData.remote;

            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
        }

        if (TestData.browserVersion != null) {
            Configuration.browserVersion = TestData.browserVersion;
        }

    }
}
