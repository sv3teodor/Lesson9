package endpoints;

import dto.DTOProducts;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class CartApi extends BaseApi {

    public CartApi(String token) {
        super(token);
    }

    @Step("Получить корзину")
    public Response getCart() {
        return getBuilder().get(Urls.CART);
    }

    @Step("Добавить продукт в корзину")
    public Response addProductToCard(DTOProducts DTOProducts) {
        return getBuilder()
                .body(DTOProducts)
                .post(Urls.CART);
    }

    @Step("Удалить продукт из корзины")
    public Response removeProductFromCart(DTOProducts DTOProducts) {
        return removeProductFromCart(DTOProducts.getId());
    }

    @Step("Удалить продукт из корзины")
    public Response removeProductFromCart(int productId) {
        return getBuilder()
                .delete(Urls.CART + "/" + productId);
    }

}
