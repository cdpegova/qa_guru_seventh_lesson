package properties;

import org.junit.jupiter.api.Test;

public class SystemPropertiesTest{
    @Test
    void systemPropertiesTest(){
        String browserName = System.getProperty("browser", "yandex");
        System.out.println(browserName);
    }
}
