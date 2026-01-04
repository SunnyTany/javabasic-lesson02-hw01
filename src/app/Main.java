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

/*реалізуйте функціонал формування замовлень.
При реалізації функціоналу зверніть увагу на створення
та перевикористання певних змінних
для відповідних даних замовлення.

Order No 1 Client: Alice.
Product: smartphone,
price EUR 305.99.
Address: Moon Street, 10.
Order No 2 Client: 2.
Product: laptop,
price EUR 570.95.
Address: Terra Street, 17.

*/