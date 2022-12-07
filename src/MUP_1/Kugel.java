package MUP_1;

public class Kugel {
    private double radius;
    private static double PI = Math.PI;


    public Kugel(double einradius) {
        radius = einradius;
    }

    public double getRadius() {
        return radius;
    }
    public double getDurchmesser() {
        return radius*2;
    }
    public double getVolumen() {
        return (double) (4 / 3) * PI * (radius * radius * radius);
    }

    public double getOberfllaeche() {
        return 4 * PI * (radius * radius);
    }
}
