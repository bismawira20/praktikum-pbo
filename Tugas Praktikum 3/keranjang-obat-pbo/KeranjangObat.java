/* Nama File    : KeranjangObat.java */
/* Pembuat      : Bisma Wira Adi  - 24060122140120 */
public class KeranjangObat {
    private String[] keranjang;
    private int count;
    private final int kapasitas;

    public KeranjangObat(int kapasitas) {
        this.keranjang = new String[kapasitas];
        this.count = 0;
        this.kapasitas = kapasitas;
    }

    public void tambahObat(String obat) {
        // Tambahkan logika untuk menambahkan obat ke dalam keranjang
        // Berikan asersi jika keranjang sudah penuh (jumlah obat mencapai batas)
        assert count < kapasitas : "Keranjang sudah penuh";
        keranjang[count++] = obat;
    }

    public void tampilkanObat() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}
