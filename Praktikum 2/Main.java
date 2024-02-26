public class Main {
    public static void main(String[] args) {
        Titik titikAwal = new Titik(8, 3);
        Titik titikRefleksiX = titikAwal.refleksiX();
        Titik titikRefleksiY = titikAwal.refleksiY();

        System.out.println("Titik Awal: (" + titikAwal.getX() + ", " + titikAwal.getY() + ")");
        System.out.println("Refleksi terhadap sumbu X: (" + titikRefleksiX.getX() + ", " + titikRefleksiX.getY() + ")");
        System.out.println("Refleksi terhadap sumbu Y: (" + titikRefleksiY.getX() + ", " + titikRefleksiY.getY() + ")");
    }
}