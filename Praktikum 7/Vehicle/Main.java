//Nama:Bisma Wira Adi Wicaksono
//NIM:24060122140120

public class Main {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 100);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}