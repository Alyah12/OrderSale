package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    private OrderItem (){

    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }


    public Double subtotal (){
        return price * quantity;
    }
}
