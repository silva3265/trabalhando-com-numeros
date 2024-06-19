package big_decimal;

import java.math.BigDecimal;

public class Principal1 {

    public static void main(String[] args) {
        BigDecimal valorTotal = new BigDecimal("2.05"); /* pra dinheiro nos usamos o formato BigDecimal, tem muito mais precisao  */
        BigDecimal valorPago = new BigDecimal("1.05");

        BigDecimal valorDevido = valorTotal.subtract(valorPago); /* subtract - metodo do BigDecimal para subtrair */

        System.out.println(valorDevido);
    }

}