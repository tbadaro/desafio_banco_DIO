public class Transacao{

    protected enum TipoTransacao {
        SAQUE,
        DEPOSITO,
        TRANSFERENCIA
    }

    protected double valor;
    protected Conta contaDestino;
    protected Conta conta;
    protected TipoTransacao tipoTransacao;

    protected Transacao(TipoTransacao tipo,Conta conta, Conta contaDestino, double valor) {
        this.conta = conta;
        this.tipoTransacao = tipo;
        this.valor = valor;
        this.contaDestino = contaDestino;
    }

    protected static void saque(Conta conta, double valor){
        conta.saldo -= valor;
        Transacao saque = new Transacao(TipoTransacao.SAQUE, conta, null, valor);
        conta.transacoes.add(saque);
    }
    protected static void deposito(Conta conta, double valor){
        conta.saldo += valor;
        Transacao deposito = new Transacao(TipoTransacao.DEPOSITO, conta, null, valor);
        conta.transacoes.add(deposito);
    }
    protected static void transferencia(Conta conta, Conta contaDestino, double valor){
        conta.saldo -= valor;
        contaDestino.saldo += valor;
        Transacao transferencia = new Transacao(Transacao.TipoTransacao.TRANSFERENCIA, conta, contaDestino, valor);
        conta.transacoes.add(transferencia);
        contaDestino.transacoes.add(transferencia);
    }

}
