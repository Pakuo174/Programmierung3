package mathematik;

import trigonometrie.Winkel;

public class Vektor {

    private double xKoor;
    private double yKoor;

    // Statischer Nullpunkt-Vektor
    public static final Vektor NULLPUNKT = new Vektor(0, 0);

    public Vektor(double xKoor, double yKoor){
        this.xKoor = xKoor;
        this.yKoor = yKoor;
    }
    // Dieser Konstruktor erstellt einen Vektor im 2D-Raum, wenn man nicht direkt die x- und y-Koordinaten kennt
    public Vektor (double laengeVektor, Winkel winkelXAchse ){
        double rad = winkelXAchse.getWinkelImBogenmass();
        this.xKoor = laengeVektor * Math.cos(rad);
        this.yKoor = laengeVektor * Math.sin(rad);
    }

    // Vektoren addieren : a = (x1,y1) b = (x2,y2) a+b=(x1+x2,y1+y2)
    public Vektor addieren(Vektor v) {
        return new Vektor(this.xKoor + v.xKoor, this.yKoor + v.yKoor);
    }


}
