/* NIM & Nama : 24060122140120 & Bisma Wira Adi Wicaksono*/

public class Kubus {
    // Atribut
    private double sisi;

    // Konstruktor
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung volume kubus
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    // Method untuk menghitung luas permukaan kubus
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}