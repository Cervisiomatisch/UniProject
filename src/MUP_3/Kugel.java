package MUP_3;

//TODO muss die Klasse abstract sein? Wenn ja, wie soll ich dann Objekte davon in GeometricObjectMain erstellen?
// Abstrakte Klassen sind eher wie ein Interface mit Logik.
// Nein die Klassen muss eine normale Klasse sein :)
public class Kugel implements GeometricObjectI{
    //TODO warum hier wieder final bei Radius?
    // radius soll nie geändert werden können bei diesem Objekt. Der Radius wird nur bei erstellen des Objekts durch
    // den einzigen Konstruktor geändert. Dadurch kann der Radius nur 1x gesetzt werden (da es auch keine Setter gibt)
    // Dadurch schlägt dir die IDE vor das gleich final zu machen, was eigentlich auch gut ist.
    // Dadurch gehst du auch sicher das der Radius von diesen einem Objekt sich nicht einfach ändern kann, sondern immer
    // gleich ist
    private double radius;
    private static final double PI = Math.PI;


    public Kugel(double einradius) {
        radius = einradius;
    }
    // getA und getRaumdiagoonale zurückändern, die Kugel diese Methoden eig. nicht besitzt
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
