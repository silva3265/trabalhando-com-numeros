package DecimalFormat;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Principal {

    public static void main(String[] args) {
        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = -1;
        BigDecimal d = new BigDecimal("45.362");

//        NumberFormat formatador = new DecimalFormat("O valor é ¤ #,##0.00;O valor é (¤ #,##0.00)");
//        NumberFormat formatador = NumberFormat.getPercentInstance();
        NumberFormat formatador = NumberFormat.getCurrencyInstance(); /* getCurrencyInstance - ess emetodo ja configura o numero pra percentual */

//        formatador.setRoundingMode(RoundingMode.DOWN);

        System.out.println(formatador.format(a)); 
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));
    }

}