package MUP_3;

import java.util.ArrayList;
import java.util.List;

public class GeometrischeObjekte {
    //TODO warum wird mir final vorgeschlagen?
    private List<GeometricObjectI> objectIList;

    public GeometrischeObjekte() {
        //Liste, welche die Objekte von Kugel und Würfel speichern soll, initialisieren
        objectIList = new ArrayList<>();
    }

    public void add(GeometricObjectI obj){
        objectIList.add(obj);
    }

    public int getanzahl(){
        return objectIList.size();
    }

    public void ausgeben(){
        for (int pos = 0; pos < getanzahl(); pos ++) {
            //Unterscheiden, welche Klasse, da die Ausgabe mit "Kugel" oder mit "Würfel" beginnt und andere Parameternamen hat
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
