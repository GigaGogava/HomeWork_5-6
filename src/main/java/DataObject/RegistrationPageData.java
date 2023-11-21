package DataObject;

import com.github.javafaker.Faker;

public interface RegistrationPageData {
    Faker faker = new Faker();
    String randomName = faker.name().firstName();
    String randomlastName = faker.name().lastName();
    String randomEmail = faker.internet().emailAddress();

    String
        firstName = randomName,
        lastName = randomlastName,
        email = randomEmail,
        password = "123456",
        confirmPassword = "123456",
        negativeFirstname = "",
        negativeLastname = "",
        negativeEmail = "blackmail.com",
        negativePassword = "123",
        negativeConfirmPassword = "132412";
}
