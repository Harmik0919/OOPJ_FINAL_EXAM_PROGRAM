
// que 70
// Write down 5 Classes of any one system with minimum 2 methods and 3 attributes. Show 
// the relationship among the classes and draw UML class Diagram.


class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void login() {
        // login logic
    }

    public void logout() {
        // logout logic
    }
}

class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public void displayProductDetails() {
        // display product details logic
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
}

class Order {
    private String orderId;
    private User user;
    private Product product;

    public Order(String orderId, User user, Product product) {
        this.orderId = orderId;
        this.user = user;
        this.product = product;
    }

    public void placeOrder() {
        // place order logic
    }

    public void cancelOrder() {
        // cancel order logic
    }
}

class ShoppingCart {
    private User user;
    private List<Product> products;
    private double totalPrice;

    public ShoppingCart(User user) {
        this.user = user;
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.getPrice();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        totalPrice -= product.getPrice();
    }
}

class Payment {
    private String paymentId;
    private Order order;
    private double amount;

    public Payment(String paymentId, Order order, double amount) {
        this.paymentId = paymentId;
        this.order = order;
        this.amount = amount;
    }

    public void processPayment() {
        // process payment logic
    }

    public void refundPayment() {
        // refund payment logic
    }
}
