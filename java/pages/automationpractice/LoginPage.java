package pages.automationpractice;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public static void open() {
        Selenide.open("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    private static SelenideElement
            eMail = $("#email"),
            passWord = $("#passwd"),
            signinButton = $("#SubmitLogin"),
            alertDanger = $(By.className("alert-danger"));

    public static void Login(String email,String password){
        eMail.setValue(email);
        passWord.setValue(password);
    }
    public static void signin(){
        signinButton.click();
    }

    public static void checkErrorMessage(){
        alertDanger.shouldBe(visible);
    }
}

