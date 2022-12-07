package MUP_2;

public class PythagoraeischeZahlentripel {

    public static int[] createIntArray(int minimum, int maximum) {
        int[] einArray = new int[maximum-minimum+1];
        for (int i = minimum; i<= maximum; i++){
            einArray[i-minimum] = i;
        }
        return einArray;
    }

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
    public static boolean testAufQuadrat(int testzahl){
        return (Math.floor(Math.sqrt(testzahl)))*(Math.floor(Math.sqrt(testzahl))) == testzahl;
    }

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
