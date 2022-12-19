package MUP_3;

//TODO muss die Klasse abstract sein? Wenn ja, wie soll ich dann Objekte davon in GeometricObjectMain erstellen?
public class Wuerfel implements GeometricObjectI{

    //a ist nicht so guter parameter name, sehe aber den getter der nur getA heißt.... Aufgabenstellen etwas mau
    private double a;

    public Wuerfel(double kantenlaenge)throws GeometricObjectException {
        if (kantenlaenge < 0){
            throw (new GeometricObjectException("Wuerfel: Parameter <Kantenlänge> < 0; Wert: "+kantenlaenge));
        } else {
            this.a = kantenlaenge;
        }
    }
    @Override
    public double getA(){
        return a;
    }
    @Override
    public double getRaumdiagonale() {
        return Math.sqrt(3) * a;
    }
    @Override
    public double getVolumen(){
        return a * a * a;
    }
    @Override
    public double getOberflaeche(){
        return (a * a) * 6;
    }
}
