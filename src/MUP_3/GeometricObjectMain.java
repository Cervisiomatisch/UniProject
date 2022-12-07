package MUP_3;

public class GeometricObjectMain {
    public static void main(String[] args) {
        //Kugel und Würfel instanziieren
        GeometricObjectI kugel1 = new Kugel(3.14);
        GeometricObjectI kugel2 = new Kugel(275.836);
        GeometricObjectI wuerfel1 = new Wuerfel(3.14);
        GeometricObjectI wuerfel2 = new Wuerfel(275.836);
        //Exception wegen negativer Kantenlänge abfangen
        try {
            GeometricObjectI wuerfel3 = new Wuerfel(-207.15);
        } catch(GeometricObjectException e) {
            System.out.println(e);
        }
        //Objekt der Klasse GeometrischeObjekte instanziiert
        GeometrischeObjekte GeoObjekte = new GeometrischeObjekte();
        //Erfolgreich instanziierte Objekte von oben einfügen
        GeoObjekte.add(kugel1);
        GeoObjekte.add(kugel2);
        GeoObjekte.add(wuerfel1);
        GeoObjekte.add(wuerfel2);
        //Ausgabe aller Elemente
        GeoObjekte.ausgeben();

    }
}
