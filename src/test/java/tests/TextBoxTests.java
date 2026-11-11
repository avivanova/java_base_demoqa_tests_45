package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp () {
        Configuration.browser = "chrome";
        //  Configuration.browserVersion = "144.0";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        //       Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 1000; // default 4000
    }

    @Test
    void successfulFillFormTest() {

        open("https://demoqa.com/text-box");
        $("[id=userName]").val("Александра");
        $("[id=userEmail]").val("alex@an.com");
        $("[id=currentAddress]").val("Москва, ул. Новая, 10");
        $("[id=permanentAddress]").val("Москва, ул. Красивая, 5");
        $("[id=submit]").click();

        $("[id=output] [id=name]").shouldHave(text("Александра"));
        $("[id=output] [id=email]").shouldHave(text("alex@an.com"));
        $("[id=output] [id=currentAddress]").shouldHave(text("Москва, ул. Новая, 10"));
        $("[id=output] [id=permanentAddress]").shouldHave(text("Москва, ул. Красивая, 5"));
    }
}
