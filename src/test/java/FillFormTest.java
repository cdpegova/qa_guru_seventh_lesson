import org.junit.jupiter.api.Test;
import pages.DaraForTest;

import static com.codeborne.selenide.Selenide.open;

public class FillFormTest extends BaseTest {

    DaraForTest service = new DaraForTest();
    Attachments attachments = new Attachments();

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        service.fillForm();
        service.clickButton();
        attachments.addVideo();
        attachments.browserConsoleLogs();
        attachments.screenshotAs("Last screenshot");
        attachments.pageSource();

    }

}
