package pages.demoqa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.checked;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    public static void open() {
        Selenide.open("http://demoqa.com/registration/");
    }

    private static SelenideElement
            status=$(By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[1]")),
            hobby=$(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[2]")),
            messege = $(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/p")),
            submitBtn = $(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input")),
            firstName = $("#name_3_firstname"),
            lastName = $("#name_3_lastname"),
            phone = $("#phone_9"),
            userName = $("#username"),
            eMail = $("#email_1"),
            password = $("#password_2"),
            confirmPassword = $("#confirm_password_password_2"),
            error = $(By.className("legend"));


    public static void submit() {
        submitBtn.click();
    }

    public static void selectMarialAndHobby(){
        status.click();
        hobby.click();
    }

    public static void checkthatMarialStatusAndHobbyisChecked(){
        status.shouldBe(checked);
        hobby.shouldBe(checked);
    }

    public static void fillPhoneUserNameEmail(String tel,String user,String mail){
        phone.setValue(tel);
        userName.setValue(user);
        eMail.setValue(mail);
    }

    public static void fillFirstNameLastName(String name,String surname){
        firstName.setValue(name);
        lastName.setValue(surname);
    }

    public  static void fillPasswordConfirmPassword(String pass,String cpass){
        password.setValue(pass);
        confirmPassword.setValue(cpass);
    }

    public static void errorShouldBeVisible() {
        if (error.isDisplayed()) {
            error.shouldBe(visible);
            System.out.println(error.text());
        } else {
            messege.shouldBe(visible);
            System.out.println(messege.text());
        }
        if (!error.isDisplayed() && !messege.isDisplayed()) {
            System.out.println("Messege is not visible");
        }
    }

    public static void successMessegeShouldBeVisible(){
        messege.shouldBe(visible);
        System.out.println(messege.text());
    }
}
