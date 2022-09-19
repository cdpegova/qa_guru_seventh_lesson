import io.qameta.allure.Attachment;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Attachments {
    @Attachment(value = "Video", type = "text/html", fileExtension = ".html")
    public static void addVideo() {
        getVideoUrl(getSessionId());
    }

    public static void getVideoUrl(String sessionId) {
        String videoUrl = "https://selenoid.autotests.cloud/video/" + sessionId + ".mp4";

        try {
            new URL(videoUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static String getSessionId(){
        return ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
    }
}
