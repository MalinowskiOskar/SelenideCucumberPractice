package pages.automationpractice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserFormPage {

    private static SelenideElement
            userNameField = $(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span"));


    public static void checkUserNameAtDashboard(String userName){
        userNameField.shouldHave(Condition.text(userName));
    }

}
