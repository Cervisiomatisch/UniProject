package MUP_3;

public interface GeometricObjectI {
    //Methoden, die die Klassen "Kugel" und "Wuerfel" gleich haben
    //werden dann in den Klassen direkt überschrieben
    //getA müsste hier eigentlich raus, genauso die Raumdiagonale, da es sich nur um die Diagonale handelt bei der Kugel und um den Radius
    double getA();

    double getRaumdiagonale();

    double getVolumen();

    double getOberflaeche();
}
