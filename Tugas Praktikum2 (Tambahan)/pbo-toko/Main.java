/* NIM & Nama : 24060122140120 & Bisma Wira Adi Wicaksono*/

public class Main
{
   public static void main(String[] args) {
        // Membuat objek Penjual
        Penjual penjual1 = new Penjual("Crish JOhn", "Jl. Mugas Raya No. 69", "08976542237");

        // Membuat objek Produk dengan Penjual terkait
        Produk produk1 = new Produk("Sapi", 2000000, 3, "Sapi", penjual1);

        // Mendapatkan dan mencetak informasi Penjual dari Produk
        Penjual penjualProduk1 = produk1.getPenjual();
        System.out.println("Informasi Penjual:");
        System.out.println("Nama: " + penjualProduk1.getNama());
        System.out.println("Alamat: " + penjualProduk1.getAlamat());
        System.out.println("Nomor Telepon: " + penjualProduk1.getNomorTelepon());
    }
}
