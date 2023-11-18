package web.fatec.entities;

public class CartShoppingModel {

    ProductModel product;
    int quantity;

    public CartShoppingModel(ProductModel product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
