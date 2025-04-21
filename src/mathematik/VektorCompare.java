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
            double betrag1 = Math.sqrt(v1.getXKoor() * v1.getXKoor() + v1.getYKoor() * v1.getYKoor());
            double betrag2 = Math.sqrt(v2.getXKoor() * v2.getXKoor() + v2.getYKoor() * v2.getYKoor());
            return Double.compare(betrag1, betrag2); //  Methode, die -1, 0 oder 1 zurückgibt und somit sortiert und somit sortiert werden könnte
        }
    }

    // Absteigend nach Winkel
    public static class WinkelComparator implements Comparator<Vektor> {
        @Override
        public int compare(Vektor v1, Vektor v2) {
            double winkel1 = Math.atan2(v1.getYKoor(), v1.getXKoor());
            double winkel2 = Math.atan2(v2.getYKoor(), v2.getXKoor());
            return Double.compare(winkel2, winkel1); // Methode, die -1, 0 oder 1 zurückgibt und somit sortiert werden könnte
        }
    }
}
