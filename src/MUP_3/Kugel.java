package MUP_3;

//TODO muss die Klasse abstract sein? Wenn ja, wie soll ich dann Objekte davon in GeometricObjectMain erstellen?
public class Kugel implements GeometricObjectI{
    //TODO warum hier wieder final bei Radius?
    private double radius;
    private static final double PI = Math.PI;


    public Kugel(double einradius) {
        radius = einradius;
    }

    @Override
    public double getA() { //getRadius TODO oder Radius lassen und bei Klasse "Wuerfel" methode mit return 0 schreiben?
        return radius;
    }
    @Override
    public double getRaumdiagonale() { //getDurchmesser
        return radius*2;
    }
    @Override
    public double getVolumen() {
        return (double) (4 / 3) * PI * (radius * radius * radius);
    }
    @Override
    public double getOberflaeche() {
        return 4 * PI * (radius * radius);
    }
}
