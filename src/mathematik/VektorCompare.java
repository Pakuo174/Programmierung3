package mathematik;

import java.util.Comparator;

/**
 * diese Klasse bedient sich dem Interface Comparator
 * * Typ Parameter ist heirbei der Vektor
 * * Vektoren werden anhand ihrer Länge kontrolliert
 */
public class VektorCompare {

    // Aufsteigend nach Betrag, berechnet Betrag von beiden → sortiert entsprechend aufsteigend
    public static class BetragComparator implements Comparator<Vektor> {
        @Override
        public int compare(Vektor v1, Vektor v2) {
            double betrag1 = Math.sqrt(v1.getxKoor() * v1.getxKoor() + v1.getyKoor() * v1.getyKoor());
            double betrag2 = Math.sqrt(v2.getxKoor() * v2.getxKoor() + v2.getyKoor() * v2.getyKoor());
            return Double.compare(betrag1, betrag2); //  Methode, die -1, 0 oder 1 zurückgibt und somit sortiert und somit sortiert werden könnte
        }
    }

    // Absteigend nach Winkel
    public static class WinkelComparator implements Comparator<Vektor> {
        @Override
        public int compare(Vektor v1, Vektor v2) {
            double winkel1 = Math.atan2(v1.getyKoor(), v1.getxKoor());
            double winkel2 = Math.atan2(v2.getyKoor(), v2.getxKoor());
            return Double.compare(winkel2, winkel1); // Methode, die -1, 0 oder 1 zurückgibt und somit sortiert werden könnte
        }
    }
}
