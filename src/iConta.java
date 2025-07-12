import java.math.BigDecimal;

public interface iConta {

    void saque(BigDecimal valor);

    void deposito(BigDecimal valor);

    void transferencia(BigDecimal valor, Conta contaDestino);

    void exibirExtrato();

}
