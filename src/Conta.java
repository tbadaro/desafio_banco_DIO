import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Conta implements IConta {

    protected enum TipoConta {
        CONTA_CORRENTE,
        CONTA_POUPANCA
    }

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected double saldo;
    protected List<Transacao> transacoes;
    protected TipoConta tipoConta;

    public Conta(Cliente cliente, TipoConta tipoConta) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();
        this.tipoConta = tipoConta;
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta ===");
        imprimirInfos();
        System.out.println("=== Histórico de transações ===");
        imprimirHistorico();
        System.out.println(" ");
    }
    private void imprimir (boolean imprimirSaldo){
        System.out.printf("Nome do titular: %s%n", this.cliente.nome);
        System.out.printf("Tipo: %s%n", this.tipoConta);
        System.out.printf("Ag.: %d%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        if (imprimirSaldo){
            System.out.printf("Saldo: R$%.2f%n", this.saldo);
        }
    }
    protected void imprimirInfos() {
        this.imprimir(true);
    }
    public void imprimir() {
        this.imprimir(false);
    }
    protected void imprimirHistorico() {
        for (Transacao transacao : transacoes){
            if (transacao.tipoTransacao == Transacao.TipoTransacao.TRANSFERENCIA) {
                System.out.println(transacao.tipoTransacao);
                if (cliente.nome.equals(transacao.conta.cliente.nome)) {
                    System.out.printf("Beneficiário: %s%n", transacao.contaDestino.cliente.nome);
                    System.out.printf("Ag.: %s", transacao.contaDestino.agencia);
                    System.out.printf(" Conta num.: %s%n", transacao.contaDestino.numero);
                    System.out.printf("Valor: -R$%.2f%n", transacao.valor);
                } else {
                    System.out.printf("Ordenante: %s%n", transacao.conta.cliente.nome);
                    System.out.printf("Ag.: %s", transacao.conta.agencia);
                    System.out.printf(" Conta num.: %s%n", transacao.conta.numero);
                    System.out.printf("Valor: R$%.2f%n", transacao.valor);
                }
                System.out.println("----------");
            } else if (transacao.tipoTransacao == Transacao.TipoTransacao.SAQUE) {
                System.out.println(transacao.tipoTransacao);
                System.out.printf("R$: %.2f%n",transacao.valor);
                System.out.println("----------");
            } else if (transacao.tipoTransacao == Transacao.TipoTransacao.DEPOSITO) {
                System.out.println(transacao.tipoTransacao);
                System.out.printf("R$%.2f%n", transacao.valor);
                System.out.println("----------");
            }
        }
    }
}