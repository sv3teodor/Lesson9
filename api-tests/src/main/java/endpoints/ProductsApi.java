package endpoints;

import dto.DTOProducts;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class ProductsApi extends BaseApi {

    public ProductsApi(String token) {
        super(token);
    }

    @Step("Запрос списка продуктов")
    public Response getProductsList() {
        return getBuilder().get(Urls.PRODUCTS);
    }

    @Step("Добавить новый продукт")
    public Response addNewProducts(int id, String name, String category, Double price, Double discount, Integer quantity) {
        return getBuilder()
                .body(new DTOProducts(id, name, category, price, discount, quantity))
                .post(Urls.PRODUCTS);
    }

    @Step("Получить продукт по Id")
    public Response getProduct(String productId) {
        return getBuilder().get(Urls.PRODUCTS + "/" + productId);
    }

    @Step("Удалить продукт по (int)Id")
    public Response deleteProduct(int productId) {
        return getBuilder().delete(Urls.PRODUCTS + "/" + productId);
    }

    @Step("Удалить продукт по (Products)Id")
    public Response deleteProduct(DTOProducts DTOProducts) {
        return deleteProduct(DTOProducts.getId());
    }

}
