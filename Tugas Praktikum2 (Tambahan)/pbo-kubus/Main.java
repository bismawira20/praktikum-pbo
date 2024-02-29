/* NIM & Nama : 24060122140120 & Bisma Wira Adi Wicaksono*/

public class Main {
    public static void main(String[] args) {
        // Membuat objek kubus dengan sisi tertentu
        Kubus kubus1 = new Kubus(12.0);

        // Menghitung dan mencetak volume dari kubus1
        System.out.println("Volume kubus1: " + kubus1.hitungVolume());

        // Menghitung dan mencetak luas permukaan dari kubus1
        System.out.println("Luas permukaan kubus1: " + kubus1.hitungLuasPermukaan());
    }
}