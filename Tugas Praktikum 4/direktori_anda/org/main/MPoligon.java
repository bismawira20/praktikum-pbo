/*File : MPoligon.java.java
 *Nama : Bisma Wira Adi Wicaksono
  NIM : 24060122140120
 */
package direktori_anda.org.main;

import direktori_anda.org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(6, 3, 5);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());
    }
}