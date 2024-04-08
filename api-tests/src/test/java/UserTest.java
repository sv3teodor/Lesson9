import com.github.javafaker.Faker;
import dto.DTOUserProfile;
import endpoints.AuthApi;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class UserTest {

    private static Faker faker;

    @BeforeAll
    public static void UserTestInit() {
        faker = new Faker(Locale.US);
    }

    @Test
    @DisplayName("Register user test")
    public void registerUserTest() {
        DTOUserProfile DTOUserProfile = new DTOUserProfile(faker.name().name(), faker.internet().password());
        System.out.println(AuthApi.userRegister(DTOUserProfile).asPrettyString());
    }

    @Test
    @DisplayName("login user test")
    public void loginUserTest() {
        DTOUserProfile DTOUserProfile = new DTOUserProfile(faker.name().name(), faker.internet().password());
        System.out.println(AuthApi.userRegister(DTOUserProfile).asPrettyString());
        System.out.println(AuthApi.userLogin(DTOUserProfile).asPrettyString());
    }
}
