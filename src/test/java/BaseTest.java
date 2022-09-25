import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.TestJenkinsData;

public class BaseTest {

    @BeforeAll
    static void configure() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = TestJenkinsData.baseUrl;
        Configuration.browser = TestJenkinsData.browserName;
        Configuration.browserVersion = TestJenkinsData.browserVersion;
        Configuration.browserSize = TestJenkinsData.browserSize;

        if (TestJenkinsData.remote == null || TestJenkinsData.remote.equals("")) {
        } else {
            Configuration.remote = "https://"
                    + TestJenkinsData.LOGIN_REMOTE + ":"
                    + TestJenkinsData.PASSWORD_REMOTE + "@"
                    + TestJenkinsData.remote;

            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
        }

        if (TestJenkinsData.browserVersion != null) {
            Configuration.browserVersion = TestJenkinsData.browserVersion;
        }

    }
}
