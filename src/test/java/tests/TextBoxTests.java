package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase {

    @Test
    void successfulFillFormTest() {

        open("/text-box");

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
