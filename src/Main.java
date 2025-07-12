import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("João da Silva");

        Conta cc = new ContaCorrente(cliente);
        cc.deposito(BigDecimal.valueOf(200));

        Conta  poupanca = new ContaPoupanca(cliente);
        cc.transferencia(BigDecimal.valueOf(100), poupanca);

        cc.exibirExtrato();
        poupanca.exibirExtrato();
    }

}