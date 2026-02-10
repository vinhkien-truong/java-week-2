package projects;

public class shoppingCart {
    public static void main(String[] args) {
        Product[] arrayProd = new Product[5];
        arrayProd[0] = new Product("Apple", 1.5, 4);
        arrayProd[1] = new Product("Milk", 2.0, 2);
        arrayProd[2] = new Product("Bread", 1.2, 3);
        arrayProd[3] = new Product("Eggs", 3.5, 1);
        arrayProd[4] = new Product("Rice", 10.0, 1);
        System.out.println("Total price: " + calculateTotal(arrayProd));
    }
    public static double calculateTotal(Product[] products) {
        double total = 0;
        for (Product prod : products) {
            total += prod.price * prod.quantity;
        }
        return total;
    }
}

class Product {
    String name;
    double price;
    int quantity;

    Product () {}
    Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateTotal() {

        return 0;
    }
}