package Homework5.DomainModel;

import java.util.ArrayList;
import java.util.List;

//Класс "Заказ"
class Order {
    private String orderId;
    private List<Product> products;
    
    public Order(String orderId){
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public String getOrderId(){
        return orderId;
    }

    public List<Product> geProducts(){
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
