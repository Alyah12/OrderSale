package entities;
import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date momment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> itens = new ArrayList<OrderItem>();

    public Order() {

    }

    public Order(Date momment, OrderStatus status, Client client) {
        this.momment = momment;
        this.status = status;
        this.client = client;
    }

    public Date getMomment() {
        return momment;
    }

    public void setMomment(Date momment) {
        this.momment = momment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItens() {
        return itens;
    }

    public void setItens(List<OrderItem> itens) {
        this.itens = itens;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order momment: ");
        sb.append(momment + "\n");
        sb.append("Order status");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        for (OrderItem item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem it : itens) {
            sum += it.subtotal();
        }
        return sum;
    }
}