import dto.DTOUserProfile;
import endpoints.AuthApi;
import endpoints.ProductsApi;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductTest {
    static DTOUserProfile DTOUserProfile;
    ProductsApi productsApi;

    @BeforeAll
    public static void createUser() {
        DTOUserProfile = new DTOUserProfile("mcncn1", "aaaa");
        AuthApi.userRegister(DTOUserProfile);
    }

    @BeforeEach
    public void initTest() {
        productsApi = new ProductsApi(AuthApi.userLogin(DTOUserProfile).jsonPath().getString("access_token"));
    }

    @Test
    @DisplayName("Get products")
    public void getProductsTest() {
        productsApi.getProductsList().prettyPrint();
    }

}
