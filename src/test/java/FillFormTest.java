import org.junit.jupiter.api.Test;
import pages.DaraForTest;

import static com.codeborne.selenide.Selenide.open;

public class FillFormTest extends BaseTest {

    DaraForTest service = new DaraForTest();
    Attachments attachments = new Attachments();

    @Test
    void fillFormTest() {
        service.fillForm();
        service.clickButton();
        attachments.addVideo();
        attachments.browserConsoleLogs();
        attachments.screenshotAs("Last screenshot");
        attachments.pageSource();

    }

}
