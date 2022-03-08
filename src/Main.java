public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco do Azerbajão");

        Cliente cliente1 = new Cliente("José Silva", Cliente.TipoPessoa.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Joana Santos", Cliente.TipoPessoa.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("João Souza", Cliente.TipoPessoa.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Lachonete do Zé", Cliente.TipoPessoa.PESSOA_JURIDICA);

        banco1.addCliente(cliente1);
        banco1.addCliente(cliente2);
        banco1.addCliente(cliente3);
        banco1.addCliente(cliente4);

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

        banco1.addConta(contaCorrenteCliente1);
        banco1.addConta(contaPoupancaCliente1);
        banco1.addConta(contaPoupancaCliente2);
        banco1.addConta(contaCorrenteCliente3);
        banco1.addConta(contaCorrenteCliente4);

        Transacao.deposito(contaCorrenteCliente1, 200);
        Transacao.transferencia(contaCorrenteCliente1, contaCorrenteCliente3, 50);
        Transacao.transferencia(contaCorrenteCliente1, contaPoupancaCliente1, 50);
        Transacao.saque(contaCorrenteCliente1, 50);
        Transacao.saque(contaPoupancaCliente2, 300);
        Transacao.deposito(contaPoupancaCliente2, 1500);
        Transacao.transferencia(contaPoupancaCliente2, contaCorrenteCliente1, 150);
        Transacao.transferencia(contaPoupancaCliente2, contaCorrenteCliente3, 250);

        contaCorrenteCliente1.imprimirExtrato();
        contaPoupancaCliente1.imprimirExtrato();
        contaPoupancaCliente2.imprimirExtrato();
        contaCorrenteCliente3.imprimirExtrato();
        banco1.imprimirListaDeClientes();
        cliente1.imprimirInfoCliente();

    }
}
