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
    protected static void transacao(Transacao.TipoTransacao tipo, Conta conta, Conta contaDestino, double valor) {
        if (tipo == Transacao.TipoTransacao.SAQUE) {
            conta.saldo -= valor;
            Transacao transacao = new Transacao(tipo, conta,null, valor);
            conta.transacoes.add(transacao);
        } else if (tipo == Transacao.TipoTransacao.DEPOSITO) {
            conta.saldo += valor;
            Transacao transacao = new Transacao(tipo, conta, null, valor);
            conta.transacoes.add(transacao);
        } else if (tipo == Transacao.TipoTransacao.TRANSFERENCIA) {
            conta.saldo -= valor;
            contaDestino.saldo += valor;
            Transacao transacao = new Transacao(Transacao.TipoTransacao.TRANSFERENCIA, conta, contaDestino, valor);
            conta.transacoes.add(transacao);
            contaDestino.transacoes.add(transacao);
        } else {
            throw new RuntimeException("OPERAÇÃO INVÁLIDA");
        }
    }
}
