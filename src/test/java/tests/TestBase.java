package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp () {
        Configuration.browser = "chrome";
        //  Configuration.browserVersion = "144.0";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        //       Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 1000; // default 4000
    }
}
