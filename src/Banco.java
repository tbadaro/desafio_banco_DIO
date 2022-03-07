import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nomeDoBanco;
    private List<Conta> contas;
    protected List<Cliente> clientes;

    public Banco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }


    public String getNomeDoBanco() {
        return nomeDoBanco;
    }


    public void imprimirListaDeContas() {
        System.out.println("=== Lista de contas ===");
        System.out.println(this.nomeDoBanco);
        System.out.println("----------");
        for (Conta conta : contas){
            conta.imprimirInfo();
            System.out.println("----------");
        }
    }
    public void imprimirListaDeClientes() {
        System.out.println("=== Lista de clientes ===");
        System.out.println(this.nomeDoBanco);
        System.out.println("----------");
        for (Cliente cliente : clientes){
            System.out.printf("Código identificador: %s%n", cliente.identificador);
            System.out.printf("Nome do cliente: %s%n",cliente.nome);
            System.out.printf("Tipo: %s%n",cliente.tipoPessoa);
            System.out.println("--- Contas ---");
            for (Conta conta : contas) {
                if (conta.cliente == cliente){
                    System.out.println(conta.tipoConta);
                    System.out.printf("Ag.: %s", conta.agencia);
                    System.out.printf(" Conta num.: %s%n", conta.numero);
                    System.out.printf("Saldo: R$%.2f%n", conta.saldo);
                    System.out.println("----------");
                }
            }
            System.out.println("----------");
        }
        System.out.println(" ");
    }
}
