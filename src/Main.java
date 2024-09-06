public class Main {
    public static void main(String[] args) {
        Kafe kafe10 = new Kafe("Kafe 10");

        // Menambahkan menu makanan
        kafe10.tambahMenuMakanan(new Makanan("Classic Burger", 45000));
        kafe10.tambahMenuMakanan(new Makanan("Chicken Caesar Salad", 35000));
        kafe10.tambahMenuMakanan(new Makanan("Pasta Carbonara", 50000));
        kafe10.tambahMenuMakanan(new Makanan("Nasi Goreng Kafe 10", 40000));
        kafe10.tambahMenuMakanan(new Makanan("Grilled Chicken Sandwich", 38000));
        kafe10.tambahMenuMakanan(new Makanan("Fish and Chips", 55000));
        kafe10.tambahMenuMakanan(new Makanan("Veggie Wrap", 33000));
        kafe10.tambahMenuMakanan(new Makanan("Mie Goreng Jawa", 35000));
        kafe10.tambahMenuMakanan(new Makanan("Chicken Wings", 40000));
        kafe10.tambahMenuMakanan(new Makanan("Cheese Nachos", 32000));

        // Menambahkan menu minuman
        kafe10.tambahMenuMinuman(new Minuman("Kopi Tubruk", 20000));
        kafe10.tambahMenuMinuman(new Minuman("Cappuccino", 25000));
        kafe10.tambahMenuMinuman(new Minuman("Iced Americano", 23000));
        kafe10.tambahMenuMinuman(new Minuman("Matcha Latte", 28000));
        kafe10.tambahMenuMinuman(new Minuman("Jus Jeruk Segar", 22000));
        kafe10.tambahMenuMinuman(new Minuman("Es Teh Manis", 15000));
        kafe10.tambahMenuMinuman(new Minuman("Mango Smoothie", 30000));
        kafe10.tambahMenuMinuman(new Minuman("Lemonade Mint", 27000));
        kafe10.tambahMenuMinuman(new Minuman("Hot Chocolate", 28000));
        kafe10.tambahMenuMinuman(new Minuman("Mocktail Berry Blast", 35000));

        // Menjalankan sistem kafe
        kafe10.tampilkanMenu();
        kafe10.mulaiTransaksi(); // Mulai transaksi
    }
}
