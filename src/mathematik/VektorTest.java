package mathematik;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class VektorTest {


    @Test
    public void AusgabeVektor(){
        Vektor v1 = new Vektor(1,2);
        Vektor v2 = new Vektor(144,2);

        System.out.println(v1);
        System.out.println(v2);
    }


    // MethodenKopf array.sort === public static <T> void sort(T[] a, Comparator<? super T> c) wird genutzt
    // ** T[] a - ist das Array von Objekten, das sortiert werden soll – in deinem Fall Vektor[].
    // ** Comparator<? super T> c ist ein Vergleichsobjekt (z.B. new VektorCompare.BetragComparator()), das zwei Elemente vergleicht.
    @Test
    public void sortVektors(){

        Vektor[] vektoren = {
                new Vektor(35, 44),
                new Vektor(12, 1),
                new Vektor(-2, 52)
        };
        // Nach Betrag sortieren
        Arrays.sort(vektoren, new VektorCompare.BetragComparator());    // mehrfach die Methode compare(v1, v2) aus der BetragComparator-Klasse aufgerufen um Array zu sortieren
        System.out.println("Sortiert nach Betrag:");
        for (Vektor v : vektoren) {                                     // Nach dem Sortieren durchläuft eine Schleife das Array und gibt die sortierten Vektoren aus
            System.out.println(v);
        }
    }
}
