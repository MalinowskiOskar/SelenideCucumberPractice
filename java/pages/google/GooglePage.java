package pages.google;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GooglePage {

    public static void open() {
        Selenide.open("https://www.google.com/");
    }

    private static SelenideElement
            Search = $(By.name("q")),
            ResultContain = $("#ires .g");

    private static ElementsCollection
            Result = $$("#ires .g");

    public static void searchInGoogle(String find){
        Search.setValue(find).pressEnter();
    }

    public static void checkMatchesShow(int result){
        Result.shouldHave(size(result));
    }

    public static void getExpectText(String Text){
        ResultContain.shouldHave(text(Text));
    }

}
