package MUP_1;

public class Kugeln {

    public static void main(String[] args) {
        Kugel Kugel1 = new Kugel(5);
        Kugel Kugel2 = new Kugel(7);
        Kugel Kugel3 = new Kugel(-21);
        Kugel[] Murmeln = {Kugel1, Kugel2, Kugel3};

        for (int pos = 1; pos < Murmeln.length; pos++) {
            System.out.println("Kugel:      "+pos+1);
            System.out.println("Radius:     "+Murmeln[pos].getRadius());
            System.out.println("Durchmesser:"+Murmeln[pos].getDurchmesser());
            System.out.println("Volumen:    "+Murmeln[pos].getVolumen());
            System.out.println("Oberfläche: "+Murmeln[pos].getOberfllaeche());
        }
    }
}
