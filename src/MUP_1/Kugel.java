package MUP_1;

/**
 * NUR INFORMATIV
 *
 * Mit Java 16 + 17 kommen gibt es Datenklassen namens record. Diese können z.B. so aussehen:
 * public record Kugel(double radius)
 * der record erzeugt automatisch den Standardkonstruktor und die getter und setter für radius
 *
 * Normalerweiße würde man nur das Kugel Object erzeugen, ohne das diese Logik enthält.
 * dadurch würde z.b. der record alleine reichen
 * danach wird noch eine KugelService.class erstellt oder ähnlicher name. die den Logikpart übernimmt (also die berechnungen)
 * die getter und setter sind aber weiterhin teil des Kugelmodels
 */
public class Kugel {
    private double radius;
    private static double PI = Math.PI;

    // einradius kann ruhig zu radius umbenannt werden. Benutze "this" bei dem Radius, um auf das attribut der Klasse zu referenzieren
    // z.b. public Kugel(double radius) { this.radius = radius)
    public Kugel(double einradius) {
        radius = einradius;
    }

    public double getRadius() {
        return radius;
    }
    public double getDurchmesser() {
        return radius*2;
    }
    public double getVolumen() {
        return (double) (4 / 3) * PI * (radius * radius * radius);
    }

    public double getOberfllaeche() {
        return 4 * PI * (radius * radius);
    }

    // Um ein Objekt zu einen spezifischen und immer gleichen String auszugeben, kann man die toString Methode, welche jede Klasse von der Objekteklasse
    // erbt, überschreiben. Dadurch muss man die Änderung nicht irgendwo im Code machen. In der PDF steht aber das man nur
    // die wichtigsten Methoden benutzen soll, weswegen ich nicht weiß, ob man das machen darf....
    @Override
    public String toString() {
        return "Kugel{" +
                "\nRadius: \t\t" + getRadius() +
                "\nOberfläche:\t\t" + getOberfllaeche() +
                "\nVolumen:\t\t" + getVolumen() +
                "\nDurchmesser:\t" + getDurchmesser() +
                "\n___________________________\n" +
                '}';
    }
}
