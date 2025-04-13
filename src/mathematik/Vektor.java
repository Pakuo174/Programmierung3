package mathematik;

import trigonometrie.Winkel;

/**
 * Die Klasse Vektor repräsentiert einen zweidimensionalen Vektor im Raum.
 * * bietet grundlegende Operationen wie Addition, Skalarprodukt, Inversion
 */
public class Vektor {

    // x- und y-Koordinate des Vektors
    private double xKoor;
    private double yKoor;

    // Konstante zur Darstellung des Nullpunkts (Vektor mit Länge 0)
    public static final Vektor NULLPUNKT = new Vektor(0, 0);

    /**
     * Konstruktor zur Erstellung eines Vektors mit x- und y-Koordinaten.
     * @param xKoor x-Komponente des Vektors
     * @param yKoor y-Komponente des Vektors
     */
    public Vektor(double xKoor, double yKoor){
        this.xKoor = xKoor;
        this.yKoor = yKoor;
    }

    /**
     * Konstruktor zur Erstellung eines Vektors anhand Betrag und Winkel.
     * @param laengeVektor Betrag (Länge) des Vektors
     * @param winkelXAchse Winkel zwischen Vektor und x-Achse (in Bogenmaß)
     */
    public Vektor (double laengeVektor, Winkel winkelXAchse ){
        double rad = winkelXAchse.getWinkelImBogenmass();
        this.xKoor = laengeVektor * Math.cos(rad); // x = Betrag * cos(winkel)
        this.yKoor = laengeVektor * Math.sin(rad); // y = Betrag * sin(winkel)
    }

    /**
     * Addiert einen weiteren Vektor zu diesem Vektor.
     * @param v der zu addierende Vektor
     * @return Neuer Vektor als Ergebnis der Addition
     */
    public Vektor addieren(Vektor v) {
        return new Vektor(this.xKoor + v.xKoor, this.yKoor + v.yKoor);
    }

    /**
     * Berechnet das Skalarprodukt dieses Vektors mit einem anderen Vektor.
     * @param v der zweite Vektor
     * @return Ergebnis des Skalarprodukts
     */
    public double skalarprodukt(Vektor v){
        return (v.xKoor * this.xKoor + v.yKoor * this.yKoor);
    }

    /**
     * Liefert den inversen Vektor (entgegengesetzte Richtung).
     * @return Neuer Vektor mit negierten Komponenten
     */
    public Vektor inverserVektor(){
        return new Vektor (-this.xKoor, -this.yKoor);
    }

    /**
     * Berechnet einen Einheitsvektor, der orthogonal (senkrecht) zu diesem Vektor steht.
     * @return Orthogonaler Einheitsvektor
     */
    public Vektor orthogonalerEinheitsvektor(){
        double laenge = Math.sqrt(xKoor * xKoor + yKoor * yKoor); // Betrag des Vektors

        // Orthogonaler Vektor entsteht durch Vertauschen und Negation einer Komponente
        double xOrthogonal = -this.yKoor;
        double yOrthogonal = this.xKoor;

        // Normalisierung auf Einheitslänge
        return new Vektor(xOrthogonal / laenge, yOrthogonal / laenge);
    }

    // Getter für x-Koordinate
    public double getxKoor() {
        return xKoor;
    }

    // Getter für y-Koordinate
    public double getyKoor() {
        return yKoor;
    }

    /**
     * Gibt eine formattierte Darstellung des Vektors mit Koordinaten und Länge zurück.
     * @return String-Darstellung des Vektors
     */
    public String toString(){
        double laenge = Math.sqrt(xKoor * xKoor + yKoor * yKoor); // Betrag berechnen

        return "Der Vektor hat folgende Eigenschaften : \n" +
                "X-Koordinate       : " + getxKoor() + "\n" +
                "Y-Koordinate       : " + getyKoor() + "\n" +
                "Länge des Vektors  : " + laenge + "\n";
    }
}
