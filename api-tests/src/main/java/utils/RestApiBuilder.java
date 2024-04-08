package utils;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestApiBuilder {
    private final RequestSpecification requestSpecification;

    public RestApiBuilder(String baseUrl) {
        requestSpecification = given().baseUri(baseUrl)
                .contentType(ContentType.JSON)
                .relaxedHTTPSValidation();
    }

    public RequestSpecification build() {
        return requestSpecification;
    }

    public RestApiBuilder addAuth(String token) {
        requestSpecification.auth().oauth2(token);
        return this;
    }

}
