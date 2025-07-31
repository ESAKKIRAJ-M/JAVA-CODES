import java.util.ArrayList;
class Store{
    static String storeName;
    static String storeLocation;

    ArrayList<Product> products = new ArrayList<>();

    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails() {
        System.out.println("Store Name     : " + storeName);
        System.out.println("Store Location : " + storeLocation);
        System.out.println("=============================");
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void displayAllProducts() {
        for (Product product : products) {
            product.displayProduct();
        }
    }


}
class Product{
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Name         : " + name);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("-----------------------------");
    }
}

public class Inventory {
    public static void main(String[] args) {
       Store.setStoreDetails("Zoho Store","Tenkasi");
       Store store = new Store();

        Product p1 = new Product(101, "Pen", 10.5, 100);
        Product p2 = new Product(102, "Notebook", 35.0, 50);
        Product p3 = new Product(103, "Pencil", 5.0, 150);

        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}
