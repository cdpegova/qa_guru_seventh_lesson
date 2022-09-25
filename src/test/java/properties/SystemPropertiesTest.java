package properties;

import org.junit.jupiter.api.Test;

public class SystemPropertiesTest{
    @Test
    void systemPropertiesTest(){
        String browserName = System.getProperty("browser", "yandex");
        String browserVersion = System.getProperty("version", "101");
        String browserSize = System.getProperty("size", "1920x1080");

        System.out.println(browserName);
        System.out.println(browserVersion);
        System.out.println(browserSize);
    }
}
