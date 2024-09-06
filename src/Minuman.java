public class Minuman extends MenuItem {
    public Minuman(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Minuman: " + getNama() + " - Rp " + getHarga());
    }
}
