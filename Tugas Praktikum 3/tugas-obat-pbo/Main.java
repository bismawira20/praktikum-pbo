/* Nama File    : Obat.java */
/* Pembuat      : Bisma Wira Adi  - 24060122140120 */
public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas Pembeli dan Obat
        Pembeli pembeli = new Pembeli("John Doe");
        Obat obat1 = new Obat("Paracetamol");
        Obat obat2 = new Obat("Antibiotik");

        // TODO 4: Implementasikan try-catch untuk handling exception
        // saat pembelian obat
        try {
            // Buat dua blok catch: ketika jumlah obat sudah mencapai batas
            // dan ketika obat tidak tersedia
            pembeli.beliObat(obat1);
            pembeli.beliObat(obat2);
            pembeli.beliObat(new Obat("Obat Tidak Tersedia")); // Untuk menyimulasikan obat tidak tersedia
            pembeli.beliObat(new Obat("Obat Keempat"));
            pembeli.beliObat(new Obat("Obat Kelima"));
            pembeli.beliObat(new Obat("Obat Keenam")); // Mencoba melebihi batas obat
        } catch (BatasObatPenuhException | ObatTidakTersediaException e) {
            System.out.println(e.getMessage());
        }
    }
}
