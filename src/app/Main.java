package app;

public class Main {

    public static void printOrder(int orderNum, String clientName, String product, double price, String adressClient) {
        System.out.println("Order No " + orderNum + " Client: " + clientName + ".");
        System.out.println("Product: " + product + ".");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: " + adressClient + ".");
    }

    public static void main(String[] args) {
        printOrder(1, "Alice", "smartfone", 305.99, "Moon Street, 10");
        printOrder(2, "Tom", "laptop", 570.95, "Terra Street, 17");
    }
}
