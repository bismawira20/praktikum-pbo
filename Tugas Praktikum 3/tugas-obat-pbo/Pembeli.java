public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;
    private final int batasObat = 5;

    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[batasObat];
        jumlahObat = 0;
    }

    public String getNama() {
        return nama;
    }

    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException {
        // TODO 2: Implementasikan try-catch untuk handling exception
        // saat pembelian obat
        try {
            if (jumlahObat >= batasObat) {
                throw new BatasObatPenuhException("Jumlah obat sudah mencapai batas");
            }

            if (!obat.isTersedia()) {
                throw new ObatTidakTersediaException("Obat tidak tersedia");
            }

            obat.setTersedia(false);
            keranjangObat[jumlahObat] = obat;
            jumlahObat++;
        } catch (BatasObatPenuhException | ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}
