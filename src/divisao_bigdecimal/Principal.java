package divisao_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal {

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("10.0");
        BigDecimal y = new BigDecimal("3.0");

//        BigDecimal z = x.divide(y, 4, RoundingMode.UP); // Vai arredondar o ultimo digito pra cima
//        BigDecimal z = x.divide(y, 4, RoundingMode.DOWN); // Vai arredondar o ultimo digito pra baixo
        BigDecimal z = x.divide(y, 4, RoundingMode.HALF_EVEN); // HALF_EVEN - vai arredondar o valor 

        System.out.println(z);

        // 2.524 = 2.52 /* esse vai ser o numero arredondado usando o metodo HALF_EVEN */
        // 2.526 = 2.53
        // 2.525 = 2.53
        // 2.425 = 2.42
    }

}