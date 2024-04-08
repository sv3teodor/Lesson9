package endpoints;

import com.github.javafaker.Faker;
import io.restassured.specification.RequestSpecification;
import org.aeonbits.owner.ConfigFactory;
import utils.ApiProperites;
import utils.RestApiBuilder;

import java.util.Locale;

public class BaseApi {
    protected static Faker faker;
    ApiProperites prop = ConfigFactory.create(ApiProperites.class);
    private String token;

    public BaseApi(String token) {
        this.token = token;
        faker = new Faker(Locale.US);

    }

    public RequestSpecification getBuilder() {
        return new RestApiBuilder(prop.baseUrl())
                .addAuth(token)
                .build();
    }


}
