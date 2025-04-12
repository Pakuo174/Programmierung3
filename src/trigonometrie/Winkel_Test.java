package trigonometrie;

import org.junit.jupiter.api.Test;

public class Winkel_Test {

    @Test
    public void testWinkel(){
        Winkel w1 = new Winkel(10);
        System.out.println(w1);
        Winkel w2 = new Winkel(0);
        System.out.println(w2);
        Winkel w3 = new Winkel(-10);
        System.out.println(w3);
    }
    @Test
    public void Bogenmaß(){
        Winkel w1 = new Winkel(10);
        System.out.println(w1.getWinkelImBogenmass());
    }
}
