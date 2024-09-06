public class Makanan extends MenuItem {
    public Makanan(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Makanan: " + getNama() + " - Rp " + getHarga());
    }
}
