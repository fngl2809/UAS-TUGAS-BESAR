public class PelangganLoyal extends Pelanggan {
    private int poin;

    public PelangganLoyal(String nama) {
        super(nama);
        this.poin = 0;
    }

    public int getPoin() {
        return poin;
    }

    public void tambahPoin(int poin) {
        this.poin += poin;
    }

    public void tukarkanPoin(int jumlah) {
        if (poin >= jumlah) {
            poin -= jumlah;
            System.out.println("Poin ditukarkan sebesar: " + jumlah);
        } else {
            System.out.println("Poin tidak mencukupi.");
        }
    }
}
