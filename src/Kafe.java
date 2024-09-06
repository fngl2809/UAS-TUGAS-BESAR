import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Kafe {
    private String nama;
    private List<MenuItem> makanan;
    private List<MenuItem> minuman;

    public Kafe(String nama) {
        this.nama = nama;
        this.makanan = new ArrayList<>();
        this.minuman = new ArrayList<>();
    }

    public void tambahMenuMakanan(MenuItem item) {
        makanan.add(item);
    }

    public void tambahMenuMinuman(MenuItem item) {
        minuman.add(item);
    }

    public void tampilkanMenu() {
        System.out.println("Selamat datang di " + nama);
        System.out.println("Menu Makanan:");
        for (MenuItem item : makanan) {
            System.out.println(item.getNama() + " - Rp " + item.getHarga());
        }
        System.out.println("\nMenu Minuman:");
        for (MenuItem item : minuman) {
            System.out.println(item.getNama() + " - Rp " + item.getHarga());
        }
    }

    public void mulaiTransaksi() {
        Scanner scanner = new Scanner(System.in);
        Transaksi transaksi = new Transaksi();

        while (true) {
            System.out.println("Pilih kategori: (1) Makanan, (2) Minuman, (3) Selesai");
            int pilihan = scanner.nextInt();

            if (pilihan == 3) {
                break;
            }

            List<MenuItem> menuTerpilih = (pilihan == 1) ? makanan : minuman;

            System.out.println("Pilih item dari menu:");
            for (int i = 0; i < menuTerpilih.size(); i++) {
                System.out.println((i + 1) + ". " + menuTerpilih.get(i).getNama() + " - Rp " + menuTerpilih.get(i).getHarga());
            }

            int itemPilihan = scanner.nextInt();
            if (itemPilihan > 0 && itemPilihan <= menuTerpilih.size()) {
                transaksi.tambahItem(menuTerpilih.get(itemPilihan - 1));
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        if (transaksi.getTotalHarga() > 0) {
            System.out.println("Total yang harus dibayar: Rp " + transaksi.getTotalHarga());
            System.out.print("Masukkan jumlah uang yang dibayarkan: ");
            int uangDibayar = scanner.nextInt();
            transaksi.bayar(uangDibayar);

            transaksi.cetakTransaksi();
        } else {
            System.out.println("Tidak ada item yang dipilih. Transaksi dibatalkan.");
        }
        
        
    }
}
