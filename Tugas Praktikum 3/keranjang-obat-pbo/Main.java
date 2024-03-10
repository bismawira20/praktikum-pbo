public class Main {
    public static void main(String[] args) {
        KeranjangObat keranjangObat = new KeranjangObat(5);

        keranjangObat.tambahObat("Paracetamol");
        keranjangObat.tambahObat("Vitamin C");
        keranjangObat.tambahObat("Antibiotik");
        keranjangObat.tambahObat("Obat Flu");
        keranjangObat.tambahObat("Obat Batuk");

        try {
            // Mencoba menambahkan obat ketika keranjang sudah penuh
            keranjangObat.tambahObat("Obat Sakit Kepala"); // Asersi: keranjang sudah penuh
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }

        keranjangObat.tampilkanObat();
    }
}
