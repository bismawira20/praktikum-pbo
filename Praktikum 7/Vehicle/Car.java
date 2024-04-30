//Nama:Bisma Wira Adi Wicaksono
//NIM:24060122140120

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak*harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}