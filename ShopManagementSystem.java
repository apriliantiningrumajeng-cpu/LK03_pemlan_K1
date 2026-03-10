public class ShopManagementSystem {

    public static void main(String[] args) {

        // Array produk (Polymorphism)
        Product[] products = new Product[6];

        products[0] = new FoodProduct("F01", "Roti", 15000, 20, "10-04-2026");
        products[1] = new FoodProduct("F02", "Susu", 20000, 5, "05-04-2026");

        products[2] = new ElectronicProduct("E01", "Headphone", 300000, 10, "1 Tahun");
        products[3] = new ElectronicProduct("E02", "Smartphone", 2000000, 5, "2 Tahun");

        products[4] = new ClothingProduct("C01", "Kaos", 100000, 15, "L", "Uniqlo");
        products[5] = new ClothingProduct("C02", "Jaket", 250000, 8, "M", "Nike");

        System.out.println("=== Daftar Produk Filkom Mart ===");

        for (Product p : products) {
            p.getProductInfo();
            System.out.println("Diskon: " + p.calculateDiscount());
            System.out.println();
        }

        // Transaksi 1
        Transaction t1 = new Transaction("T01");
        t1.addItem(products[0]);
        t1.addItem(products[3]);

        // Transaksi 2
        Transaction t2 = new Transaction("T02");
        t2.addItem(products[4], 2);
        t2.addItem(products[1]);

        double total1 = t1.processSale();
        double total2 = t2.processSale();

        System.out.println("=== Laporan Penjualan ===");
        System.out.println("Total transaksi 1 : " + total1);
        System.out.println("Total transaksi 2 : " + total2);

        double totalPenjualan = total1 + total2;

        System.out.println("Total penjualan hari ini : " + totalPenjualan);
    }
}