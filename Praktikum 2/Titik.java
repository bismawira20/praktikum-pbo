public class Titik {
    private double x;
    private double y;

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Titik refleksiSumbuX() {
        return new Titik(this.x, -this.y);
    }

    public Titik refleksiSumbuY() {
        return new Titik(-this.x, this.y);
    }

    public Titik refleksiX() {
        return _refleksiX();
    }

    public Titik refleksiY() {
        return _refleksiY();
    }

    private Titik _refleksiX() {
        return new Titik(this.x, -this.y);
    }

    private Titik _refleksiY() {
        return new Titik(-this.x, this.y);
    }
}