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

        Conta conta1 = new Conta(cliente1, Conta.TipoConta.CONTA_CORRENTE);
        Conta conta2 = new Conta(cliente1, Conta.TipoConta.CONTA_POUPANCA);
        Conta conta3 = new Conta(cliente2, Conta.TipoConta.CONTA_POUPANCA);
        Conta conta4 = new Conta(cliente3, Conta.TipoConta.CONTA_CORRENTE);
        Conta conta5 = new Conta(cliente4, Conta.TipoConta.CONTA_CORRENTE);

        cliente1.addConta(conta1);
        cliente1.addConta(conta2);
        cliente2.addConta(conta3);
        cliente3.addConta(conta4);
        cliente4.addConta(conta5);

        banco1.addConta(conta1);
        banco1.addConta(conta2);
        banco1.addConta(conta3);
        banco1.addConta(conta4);
        banco1.addConta(conta5);

        Transacao.deposito(conta1, 200);
        Transacao.transferencia(conta1, conta4, 50);
        Transacao.transferencia(conta1, conta2, 50);
        Transacao.saque(conta1, 50);
        Transacao.saque(conta3, 300);
        Transacao.deposito(conta3, 1500);
        Transacao.transferencia(conta3, conta1, 150);
        Transacao.transferencia(conta3, conta4, 250);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        conta3.imprimirExtrato();
        conta4.imprimirExtrato();
        conta5.imprimirExtrato();
        banco1.imprimirListaDeClientes();
        banco1.imprimirListaDeContas();
        cliente1.imprimirInfoCliente();

    }
}
