abstract class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    // Constructor default
    public Product() {}

    // Constructor parameter
    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getter
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Setter
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // Method abstract
    public abstract double calculateDiscount();

    // Menampilkan info produk
    public void getProductInfo() {
        System.out.println(productId + " - " + name + " | Harga: " + price + " | Stok: " + stockQuantity);
    }

    // Overloading updateStock
    public void updateStock(int quantity) {
        stockQuantity += quantity;
    }

    public void updateStock(int quantity, String reason) {
        stockQuantity += quantity;
        System.out.println("Update stok karena: " + reason);
    }
}