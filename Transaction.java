class Transaction {

    private String transactionId;
    private Product[] items = new Product[10];
    private int totalItems = 0;

    public Transaction(String transactionId) {
        this.transactionId = transactionId;
    }

    // Overloading addItem
    public void addItem(Product item) {
        items[totalItems++] = item;
    }

    public void addItem(Product item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            items[totalItems++] = item;
        }
    }

    public double processSale() {
        double total = 0;

        for (int i = 0; i < totalItems; i++) {
            Product p = items[i];
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() - discount;
            total += finalPrice;
        }

        return total;
    }
}