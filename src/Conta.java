import lombok.Data;

import java.math.BigDecimal;
import java.security.SecureRandom;

@Data
public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 123;


    protected int agencia;
    protected int numero;
    protected BigDecimal saldo = BigDecimal.ZERO;
    protected  Cliente cliente;

    public Conta(Cliente cliente) {

        this.agencia = AGENCIA_PADRAO;
        this.numero = gerarNumeroConta();
        this.cliente = cliente;
    }

    private int gerarNumeroConta() {
        SecureRandom random = new SecureRandom();
        return random.nextInt(999999);// Gera um número aleatório de 6 dígitos

    }

    @Override
    public void saque(BigDecimal valor) {
        saldo = saldo.subtract(valor);
        if (valor == null) {
            throw new IllegalArgumentException("Valor de saque não pode ser nulo.");
        }
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo.");
        }
        if (saldo.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void deposito(BigDecimal valor) {
        saldo = saldo.add(valor);
        if (saldo.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo após depósito.");
        }

        if (valor == null) {
            throw new IllegalArgumentException("Valor de depósito não pode ser nulo.");
        }
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }

    }

    @Override
    public void transferencia(BigDecimal valor, Conta contaDestino) {
        this.saque(valor);
        contaDestino.deposito(valor);
        if (contaDestino.getSaldo().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente na conta de destino.");
        }
        if (contaDestino == null) {
            throw new IllegalArgumentException("Conta de destino não pode ser nula.");
        }
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de transferência deve ser positivo.");
        }

    }


    protected void imprimirInfosComuns() {

        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.printf("Saldo: R$ %.2f \n" , this.saldo);
    }

}
