package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class Service {

    static SelenideElement
            name = $("#firstName"),
            surname = $("#lastName"),
            emailLocators = $("#userEmail"),
            radioButton = $("[for=gender-radio-1]"),
            phone = $("#userNumber"),
            picture = $("#uploadPicture"),
            dateOfBorn = $("#dateOfBirthInput"),
            subjectsLocators = $("#subjectsInput"),
            hobbies = $("#hobbiesWrapper"),
            currentAddress = $("#currentAddress"),
            state = $("#state"),
            city = $("#city"),
            submitButton = $("#submit"),

    thankYOu = $("#modal-title h4");

    Faker faker = new Faker();

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String subjects = faker.pokemon().name();


    @Step("Заполнение формы")
    public void fillForm() {
        fillName();
        fillSurname();
        fillEmail();
        clickRadioButton();
        fillPhoneNumber();
        fillSubjects();
        clickHobbies();
        fillAddress();
        clickState();
        clickCity();
    }

    @Step("Клик на ссылку")
    public void clickButton() {
        $(submitButton).click();
    }

    @Step("Заполнение имени")
    private void fillName() {
        $(name).setValue(firstName);
    }

    @Step("Заполнение фамилии")
    private void fillSurname() {
        $(surname).setValue(lastName);
    }

    @Step("Заполнение емейла")
    private void fillEmail() {
        $(emailLocators).setValue(email);
    }

    @Step("Клик на пол")
    private void clickRadioButton() {$(radioButton).click();
    }

    @Step("Заполнение телефона")
    private void fillPhoneNumber() {
        $(phone).setValue("0123456789");
    }

    @Step("Заполнение сабджекта")
    private void fillSubjects() {
        $(subjectsLocators).setValue(subjects);
    }

    @Step("Заполнение хобби")
    private void clickHobbies() {
        $(hobbies).find(new ByText("Sports")).click();
    }

    @Step("Заполнение адреса")
    private void fillAddress() {
        $(currentAddress).setValue("Moscow");
    }

    @Step("Выбор штата")
    private void clickState() {
        $(state).click();
        $(state).find(new ByText("NCR")).click();
    }

    @Step("Выбор города")
    private void clickCity() {
        $(city).click();
        $(city).find(new ByText("Delhi")).click();
    }


}
