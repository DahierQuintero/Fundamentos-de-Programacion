package fundamentosDeProgramacion.workshop1;

import java.text.DecimalFormat;

public class Punto5 {

    public static void main(String[] args) {

        double res, res2;
        DecimalFormat df = new DecimalFormat("#.0");

        /* ( 7 * (10 - 5) mod 3) * 4 + 9
           ( 7 *     5    mod 3) * 4 + 9
           (        35    mod 3) * 4 + 9
                     2           * 4 + 9
                     8               + 9
                     17
         */
        res = ( 7 * (10 - 5) % 3) * 4 + 9;
        System.out.println(res);

        /* 1 - 10 ^ 2 + 3 * (20 div 3) + 7 mod 4
           1 - 10 ^ 2 + 3 * (   6    ) + 7 mod 4
           1 -   100  + 3 *     6      + 7 mod 4
           1 -   100  +      18        + 7 mod 4
           1 -   100  +      18        +    3
              -99     +      18        +    3
                     -81               +    3
                            -78
         */
        res2 = 1 - Math.pow(10,2) + 3 * ( 20 / 3 ) + 7 % 4;
        System.out.println(res2);
    }
}
