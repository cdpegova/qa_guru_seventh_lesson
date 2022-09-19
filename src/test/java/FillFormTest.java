import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.Service;

import static com.codeborne.selenide.Selenide.open;

public class FillFormTest extends BaseTest {

    Service service = new Service();
    Attachments attachments = new Attachments();

    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");
        service.fillForm();
        service.clickButton();
        attachments.addVideo();
    }

}
