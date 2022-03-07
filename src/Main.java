public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco do Azerbajão");

        Cliente cliente1 = new Cliente("José Silva", Cliente.TipoPessoa.PESSOA_FISICA, banco);
        Cliente cliente2 = new Cliente("Joana Santos", Cliente.TipoPessoa.PESSOA_FISICA, banco);
        Cliente cliente3 = new Cliente("João Souza", Cliente.TipoPessoa.PESSOA_FISICA, banco);
        Cliente cliente4 = new Cliente("Lachonete do Zé", Cliente.TipoPessoa.PESSOA_JURIDICA, banco);

        banco.addCliente(cliente1);
        banco.addCliente(cliente2);
        banco.addCliente(cliente3);
        banco.addCliente(cliente4);

        Conta contaCorrenteCliente1 = new Conta(cliente1, Conta.TipoConta.CONTA_CORRENTE);
        Conta contaPoupancaCliente1 = new Conta(cliente1, Conta.TipoConta.CONTA_POUPANCA);
        Conta contaPoupancaCliente2 = new Conta(cliente2, Conta.TipoConta.CONTA_POUPANCA);
        Conta contaCorrenteCliente3 = new Conta(cliente3, Conta.TipoConta.CONTA_CORRENTE);
        Conta contaCorrenteCliente4 = new Conta(cliente4, Conta.TipoConta.CONTA_CORRENTE);

        cliente1.addConta(contaCorrenteCliente1);
        cliente1.addConta(contaPoupancaCliente1);
        cliente2.addConta(contaPoupancaCliente2);
        cliente3.addConta(contaCorrenteCliente3);
        cliente4.addConta(contaCorrenteCliente4);

        banco.addConta(contaCorrenteCliente1);
        banco.addConta(contaPoupancaCliente1);
        banco.addConta(contaPoupancaCliente2);
        banco.addConta(contaCorrenteCliente3);
        banco.addConta(contaCorrenteCliente4);

        Transacao.transacao(Transacao.TipoTransacao.DEPOSITO, contaCorrenteCliente1, null, 200);
        Transacao.transacao(Transacao.TipoTransacao.TRANSFERENCIA, contaCorrenteCliente1, contaCorrenteCliente3, 50);
        Transacao.transacao(Transacao.TipoTransacao.TRANSFERENCIA, contaCorrenteCliente1, contaPoupancaCliente1, 50);
        Transacao.transacao(Transacao.TipoTransacao.SAQUE, contaCorrenteCliente1, null, 50);
        Transacao.transacao(Transacao.TipoTransacao.DEPOSITO,contaPoupancaCliente2, null, 1500);
        Transacao.transacao(Transacao.TipoTransacao.TRANSFERENCIA, contaPoupancaCliente2, contaCorrenteCliente1, 150);
        Transacao.transacao(Transacao.TipoTransacao.TRANSFERENCIA, contaPoupancaCliente2, contaCorrenteCliente3, 250);

        contaCorrenteCliente1.imprimirExtrato();
        contaPoupancaCliente1.imprimirExtrato();
        contaPoupancaCliente2.imprimirExtrato();
        contaCorrenteCliente3.imprimirExtrato();
        banco.imprimirListaDeClientes();
        cliente1.imprimirInfoCliente();

    }
}
