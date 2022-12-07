package MUP_3;

import java.security.InvalidParameterException;
public class GeometricObjectException extends InvalidParameterException {
    //TODO warum einen leeren Konstruktor?
    public GeometricObjectException(){
        super();
    }

    //TODO brauche ich hier noch andere Methoden?
    public GeometricObjectException(String message){
        super("Geometric Object: "+message);
    }

}
