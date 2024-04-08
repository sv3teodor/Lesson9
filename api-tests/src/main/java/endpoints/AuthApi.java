package endpoints;

import dto.DTOUserProfile;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.aeonbits.owner.ConfigFactory;
import utils.ApiProperites;
import utils.RestApiBuilder;

public class AuthApi {
    static ApiProperites prop = ConfigFactory.create(ApiProperites.class);


    @Step("Логин пользователя")
    public static Response userLogin(DTOUserProfile DTOUserProfile) {
        return new RestApiBuilder(prop.baseUrl()).build()
                .body(DTOUserProfile)
                .post(Urls.USER_LOGIN);
    }

    @Step("Регистрация пользователя")
    public static Response userRegister(DTOUserProfile DTOUserProfile) {
        return new RestApiBuilder(prop.baseUrl()).build()
                .body(DTOUserProfile)
                .post(Urls.USER_REGISTER);
    }


}
