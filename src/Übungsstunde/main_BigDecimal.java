package Übungsstunde;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.ofLocalizedDate;
import static java.time.format.FormatStyle.SHORT;
import static java.util.Calendar.DATE;

public class main_BigDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("gebe 2 Zahlen :");
        BigDecimal b1 = scanner.nextBigDecimal();
        BigDecimal b2 = scanner.nextBigDecimal();
        System.out.println( b1 + " , " + b2);


        // b1 soll durch bs geteilt werden
        BigDecimal erg  = b1.divide(b2,2, RoundingMode.DOWN);
        System.out.println(erg);


        System.out.println("_______________________________");
        // 2.

        LocalDate d = LocalDate.now();
        System.out.println(d);

        System.out.println(d.format(DateTimeFormatter.ofLocalizedDate(SHORT)));

        // beliebiges Datum erzeugen
        LocalDate d1 = LocalDate.of(2025, 4, 15);
        System.out.println("mein Datum : " +d1.format(DateTimeFormatter.ofLocalizedDate(SHORT)));


        //System.out.println(d1);


    }
}
