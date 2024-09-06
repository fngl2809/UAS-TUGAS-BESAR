import java.util.ArrayList;
import java.util.List;

public class Order {
    private Pelanggan pelanggan;
    private List<MenuItem> items;

    public Order(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
        this.items = new ArrayList<>();
    }

    public void tambahItem(MenuItem item) {
        items.add(item);
    }

    public void tampilkanOrder() {
        System.out.println("Order dari: " + pelanggan.getNama());
        for (MenuItem item : items) {
            item.tampilkanDetail();
        }
    }
}
