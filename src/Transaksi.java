import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private List<MenuItem> items;
    private int totalHarga;
    private int uangDibayar;

    public Transaksi() {
        this.items = new ArrayList<>();
        this.totalHarga = 0;
        this.uangDibayar = 0;
    }

    public void tambahItem(MenuItem item) {
        items.add(item);
        totalHarga += item.getHarga();
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void bayar(int jumlah) {
        this.uangDibayar = jumlah;
    }

    public int hitungKembalian() {
        return uangDibayar - totalHarga;
    }

    public void cetakTransaksi() {
        System.out.println("Detail Transaksi:");
        for (MenuItem item : items) {
            System.out.println(item.getNama() + " - Rp " + item.getHarga());
        }
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("Uang Dibayar: Rp " + uangDibayar);
        int kembalian = hitungKembalian();
        if (kembalian < 0) {
            System.out.println("Uang yang diberikan kurang sebesar: Rp " + Math.abs(kembalian));
        } else {
            System.out.println("Kembalian: Rp " + kembalian);
        }

        
    }
}
