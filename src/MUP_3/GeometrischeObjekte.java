package MUP_3;

import java.util.*;

public class GeometrischeObjekte {
    //TODO warum wird mir final vorgeschlagen?
    // A: eine Liste kann final sein. Sowie auch der Radius.
    // Du willst bei dem Object GeomtrischeObjekte nicht das deine zurzeitige Liste überschrieben wird. Bei einer Liste
    // können trotzdem weiter Elemente hinzugefügt, oder gelöscht werden. Final wird dir vorgeschlagen, da du keine Setter hast
    // und die Liste im einzigen Konstruktor deklariert wird
    private List<GeometricObjectI> objectIList;

    public GeometrischeObjekte() {
        //Liste, welche die Objekte von Kugel und Würfel speichern soll, initialisieren
        objectIList = new ArrayList<>();
    }

    public void add(GeometricObjectI obj){
        objectIList.add(obj);
    }

    //großes A
    public int getanzahl(){
        return objectIList.size();
    }

    public void ausgeben(){
        for (int pos = 0; pos < getanzahl(); pos ++) {
            //Unterscheiden, welche Klasse, da die Ausgabe mit "Kugel" oder mit "Würfel" beginnt und andere Parameternamen hat

            //hier könnte man einfacher bei den klassen das toString überschreiben, dann müsste man hier keine fallunterscheidung machen,
            // sondern nur sout
            if (objectIList.get(pos).getClass() == Kugel.class) {
                System.out.println("Kugel:         ");
                System.out.println("Radius:        "+objectIList.get(pos).getA());
                System.out.println("Durchmesser:   "+objectIList.get(pos).getRaumdiagonale());
                System.out.println("Volumen:       "+objectIList.get(pos).getVolumen());
                System.out.println("Oberfläche:    "+objectIList.get(pos).getOberflaeche());
            } else {
                System.out.println("Würfel:        ");
                System.out.println("Kantenlänge:   "+objectIList.get(pos).getA());
                System.out.println("Raumdiagonale: "+objectIList.get(pos).getRaumdiagonale());
                System.out.println("Volumen:       "+objectIList.get(pos).getVolumen());
                System.out.println("Oberfläche:    "+objectIList.get(pos).getOberflaeche());
            }
        }
    }

}
