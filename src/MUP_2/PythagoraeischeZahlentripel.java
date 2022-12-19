package MUP_2;

public class PythagoraeischeZahlentripel {

    //einArray unbennen in nur array, oder z.b. fillArray, oder toFillArray; also einfach das was damit passieren soll
    public static int[] createIntArray(int minimum, int maximum) {
        int[] einArray = new int[maximum-minimum+1];
        for (int i = minimum; i<= maximum; i++){
            einArray[i-minimum] = i;
        }
        return einArray;
    }

    //man kann auch einen StringBuilder verwenden, um die einzelnen Elemente zu kontagnieren, diesen könnte man am ende der methode per println ausgeben
    // dadurch würde diese if anweisung wegfallen. Man könnte auch einfach am ende der Methode println() ausgeben, um eine leerzeile zu erhalten.
    // Also durch alle elemente iterieren und am Ende der Methode einfach noch auf leeres println()
    public static void arrayInhaltAusgeben(int[] einArray){
        for (int pos = 0; pos < einArray.length; pos++){
            if (pos+1 == einArray.length) {
                System.out.print(einArray[pos]+"\n");
            } else {
                System.out.print(einArray[pos]+", ");
            }
        }
    }
    public static int[] quadriere(int[] einArray){
        int[] quadriertesArray = new int[einArray.length];
        for (int pos = 0; pos < einArray.length; pos++){
            quadriertesArray[pos] = einArray[pos] * einArray[pos];
        }
        return quadriertesArray;
    }

    //erst parameter dann logik angeben -> testzahl == .....
    //statt math.floor kannst du auch einfach den double zu integer umwandeln
    // oder noch einfach mit typecasting (int)
    public static boolean testAufQuadrat(int testzahl){
        return (Math.floor(Math.sqrt(testzahl)))*(Math.floor(Math.sqrt(testzahl))) == testzahl;
    }

    //WICHTIG!!!! das system.out der quadratzahlen muss anders sein:
    // zahlensatz[i] + math.squt(diff) = zahlensatz[j], anders wird es falsch ausgegeben -> alle Outputs.txt sind falsch
    // naming der Methode ist flasch (fehlt ein n)
    public static int pythagoraeischeZahlentripe(int minimum, int maximum) {
        int differenz,anzahl = 0;
        int[] zahlensatz = quadriere(createIntArray(minimum, maximum));
        arrayInhaltAusgeben(zahlensatz);
        for(int i = 0; i<zahlensatz.length; i++){
            for(int j = 0; j<zahlensatz.length; j++){
                differenz = zahlensatz[j] - zahlensatz[i];
                if ((testAufQuadrat(differenz)) && differenz > zahlensatz[i]){
                    System.out.println("Inhalt des Arrays an Position i: "+ zahlensatz[i]);
                    System.out.println("Inhalt des Arrays an Position j: "+ zahlensatz[j]);
                    System.out.println("Differenz: "+differenz);
                    System.out.println("Ausgabe:");
                    System.out.println((int) Math.sqrt(zahlensatz[i])+"^2 + "+(int) Math.sqrt(zahlensatz[j])+"^2 = "+(int) Math.sqrt(differenz)+"^2");
                    anzahl++;
                }
            }
        }
        return anzahl;
    }

    public static void main(String[] args) {
        System.out.println(pythagoraeischeZahlentripe(1001, 2000));
    }
}
