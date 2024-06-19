package big_decimal;

import java.math.BigDecimal;

public class ContaCorrente {

    private BigDecimal saldo = BigDecimal.ZERO; /* ZERO - é uma constante do BigDecimal*/

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valorSaque) {
        if (valorSaque.compareTo(saldo) > 0) {
            throw new RuntimeException(
                    String.format("Saque: %s, Saldo: %s", valorSaque, saldo));
        }

        saldo = saldo.subtract(valorSaque); /* subtract - vai substituir a subtração, é um metodo do BigDecimal*/
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

}