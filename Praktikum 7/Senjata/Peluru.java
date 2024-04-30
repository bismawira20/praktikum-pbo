//Nama:Bisma Wira Adi Wicaksono
//NIM:24060122140120

public class Peluru {
    private int jumlah;
    private int kapasitasMax;

    public Peluru() {
        this.jumlah = 0;
        this.kapasitasMax = Integer.MAX_VALUE; 
    }

    public Peluru(int jumlah, int kapasitasMax) {
        this.jumlah = jumlah;
        this.kapasitasMax = kapasitasMax;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        if (jumlah >= 0 && jumlah <= kapasitasMax) { 
            this.jumlah = jumlah;
        } else {
            System.out.println("Jumlah peluru tidak valid!");
        }
    }

    public void tambahJumlah(int tambahan) {
        if (jumlah + tambahan <= kapasitasMax) {
            jumlah += tambahan;
            System.out.println("Peluru ditambah " + tambahan + " buah. Jumlah sekarang: " + jumlah);
        } else {
            System.out.println("Kapasitas peluru terlampaui!");
        }
    }

    public void kurangiJumlah(int jumlah) {
        if (this.jumlah - jumlah >= 0) {
            this.jumlah -= jumlah;
            System.out.println("Peluru dikurangi " + jumlah + " buah. Jumlah sekarang: " + this.jumlah);
        } else {
            System.out.println("Jumlah peluru tidak mencukupi!");
        }
    }

    public int getKapasitasMax() {
        return kapasitasMax;
    }

    public void setKapasitasMax(int kapasitasMax) {
        if (kapasitasMax > 0) {
            this.kapasitasMax = kapasitasMax;
        } else {
            System.out.println("Kapasitas maksimum peluru harus lebih dari 0!");
        }
    }
}
