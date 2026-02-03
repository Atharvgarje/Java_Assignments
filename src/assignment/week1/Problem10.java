package assignment.week1;

import java.io.File;
import java.util.Scanner;
class Product {
    int id;
    String name;
    double price;
    double gst;
    int availableQuantity;

    Product(int id, String name, double price, double gst, int availableQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gst = gst;
        this.availableQuantity = availableQuantity;
    }
}

public class Problem10 {

    public static void main(String[] args) throws Exception {

        Product[] products = new Product[5];
        int count = 0;
        
        File file=new File("src/doc/products.txt");

        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNext()) {
            int id = fileScanner.nextInt();
            String name = fileScanner.next();
            double price = fileScanner.nextDouble();
            double gst = fileScanner.nextDouble();
            int qty = fileScanner.nextInt();

            products[count++] = new Product(id, name, price, gst, qty);
        }

        Scanner sc = new Scanner(System.in);
        double totalAmount = 0;

        while (true) {
            for (int i = 0; i < count; i++) {
                System.out.println(
                    products[i].id + ". " +
                    products[i].name + " Rs." +
                    products[i].price + " GST:" +
                    products[i].gst + "%"
                );
            }

            System.out.println("0. Checkout");
            System.out.print("Select product id: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            Product selected = null;
            for (int i = 0; i < count; i++) {
                if (products[i].id == choice) {
                    selected = products[i];
                    break;
                }
            }

            if (selected == null) {
                System.out.println("Invalid product!");
                continue;
            }

            System.out.print("Enter quantity: ");
            int buyQty = sc.nextInt();

            if (buyQty > selected.availableQuantity) {
                System.out.println("Not enough stock!");
                continue;
            }

            double basePrice = selected.price * buyQty;
            double gstAmount = basePrice * selected.gst / 100;
            double finalPrice = basePrice + gstAmount;

            totalAmount += finalPrice;
            selected.availableQuantity -= buyQty;

            System.out.println("Added to cart. Amount: Rs." + finalPrice);
        }

        System.out.println("\nTotal Amount Payable (with GST): Rs." + totalAmount);
    }
}
