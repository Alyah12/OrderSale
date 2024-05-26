package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Program {
    public static void main(String[] args)
    {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birthdate(dd/mm/yyyy)");

        Date birthDate = null;
        try {
            birthDate = sdf.parse(sc.next());
        } catch (ParseException e){
            System.out.println("Erro de conversão");
        } catch (NullPointerException e){
            System.out.println("Não há nada escrito aqui");
        }

        Client cliente = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, cliente);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++){
            System.out.println("Enter " + i + "# item data");
            System.out.println("Product name: ");
            String productname = sc.nextLine();
            System.out.println("Enter product price: ");
            double price = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productname, price);

            OrderItem it = new OrderItem(quantity, price);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}