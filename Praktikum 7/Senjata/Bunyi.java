//Nama:Bisma Wira Adi Wicaksono
//NIM:24060122140120

public class Bunyi {
    private String suara;
    private int volume;

    public Bunyi() {
        this.suara = "";
        this.volume = 50; 
    }

    public Bunyi(String suara, int volume) {
        this.suara = suara;
        setVolume(volume);
    }

    public String getSuara() {
        return suara;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) { 
            this.volume = volume;
        } else {
            System.out.println("Volume harus berada dalam rentang 0-100!");
        }
    }

    public void mainkanSuara() {
        if (!suara.isEmpty()) {
            System.out.println("Memainkan suara: " + suara + " dengan volume " + volume);
        } else {
            System.out.println("Suara belum diatur!");
        }
    }
}
