package MUP_1;

// TODO wenn du den Code entfernst von mir, muss auch der Import wieder weg!
import java.util.*;

/*
 Dieses denglisch tut weh, aber der Aufgaben wollen es so..... am besten alles in englisch halten (soweit möglich)
 */
public class Kugeln {


    public static void main(String[] args) {

        //Kugel1,2,3 werden nur einmalig benutzt, dadurch müssen wir das Objekt nicht extra abspeichern, Edit: aber glaube der Prof will es so wie es jetzt da steht^^
        // camelCase -> kugel1, kugel2, .....
        Kugel Kugel1 = new Kugel(5);
        Kugel Kugel2 = new Kugel(7);
        Kugel Kugel3 = new Kugel(-21);
        //Listen sind in java meist einfacher zu durchzuiterieren als Arrays || camelcase murmeln / kugeln / kugelArray
        Kugel[] Murmeln = {Kugel1, Kugel2, Kugel3};

        /*

        Alles was hier folgt ist nur noch Informativ für die Serie 1:

         beispielcode: (In Java camelCase schreibweise)
        Als Liste wird standardmäßig eine ArrayList benutzt. (ok, nachdem ich alles durchgemacht habe, sollen hier wahrscheinlich
        eher noch arrays benutzt werden :D
         */
        List<Kugel> murmelList = new ArrayList<>();
        murmelList.add(new Kugel(5));
        murmelList.add(new Kugel(7));
        murmelList.add(new Kugel(-21));

        // forEach: das it ist jeweils ein element der liste
        murmelList.forEach(
                it -> {
                    String sb = "\nKugel mit:" +
                            "\nRadius: \t\t" + it.getRadius() +
                            "\nOberfläche:\t\t" + it.getOberfllaeche() +
                            "\nVolumen:\t\t" + it.getVolumen() +
                            "\nDurchmesser:\t" + it.getDurchmesser() +
                            "\n___________________________\n";
                    System.out.printf(sb);
                }
        );

        //enchanced for loop
        for(Kugel kugel : murmelList){
            kugel.toString();
        }

        // Listen erben von iteratable -> bedeuted diese sind iterierbar durch diese vererbung. Dadurch steht uns folgende Methodik zur verfügung:
        Iterator<Kugel> kugelIterator = murmelList.iterator();
        while (kugelIterator.hasNext()){
            kugelIterator.next().toString();
        }


        for (int pos = 1; pos < Murmeln.length; pos++) {
            System.out.println("Kugel:      " + pos + 1);
            System.out.println("Radius:     " + Murmeln[pos].getRadius());
            System.out.println("Durchmesser:" + Murmeln[pos].getDurchmesser());
            System.out.println("Volumen:    " + Murmeln[pos].getVolumen());
            System.out.println("Oberfläche: " + Murmeln[pos].getOberfllaeche());
        }
    }
}
