import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.Service;

import static com.codeborne.selenide.Selenide.open;

public class FillFormTest extends BaseTest {

    Service service = new Service();
    Attachments attachments = new Attachments();

    @BeforeEach
    void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }

    @Test
    void fillFormTest() {
        service.fillForm();
        service.clickButton();
        service.assertForm();
        attachments.addVideo();
    }

}
