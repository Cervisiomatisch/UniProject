package MUP_3;

import java.security.*;
public class GeometricObjectException extends InvalidParameterException {
    //TODO warum einen leeren Konstruktor?
    //das ist eine gute Frage :D
    // in der Theorie kann man dadurch einfach nur schonmal die Klasse erstellen, ohne Message
    // Problem hierbei ist, die msg / String den man der Elternklasse übergibt, kann man nur im Konstruktor setzen....
    // -> ist nur da, weil der prof es will.
    public GeometricObjectException(){
        super();
    }

    //TODO brauche ich hier noch andere Methoden?
    // nein, der Konstruktor sieht gut so aus
    public GeometricObjectException(String message){
        super("Geometric Object: " + message);
    }

}
