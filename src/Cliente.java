import java.util.ArrayList;
import java.util.List;

public class Cliente {

    protected enum TipoPessoa {
        PESSOA_FISICA,
        PESSOA_JURIDICA
    }
    protected String nome;
    private List<Conta> contas;
    public TipoPessoa tipoPessoa;
    protected Banco banco;

    public Cliente(String nome, TipoPessoa tipoPessoa, Banco banco){
        this.banco = banco;
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
        this.contas = new ArrayList<>();
    }

    public void addConta(Conta conta){
        contas.add(conta);
    }

    public void imprimirInfoCliente() {
        System.out.println("=== Informações do Cliente ===");
        System.out.printf("Nome: %s%n",this.nome);
        System.out.printf("Cliente tipo: %s%n",this.tipoPessoa);
        System.out.println("----------");
        for (Conta conta : contas) {
            System.out.println(conta.tipoConta);
            System.out.printf("Ag.: %s", conta.agencia);
            System.out.printf(" Conta num.: %s%n", conta.numero);
            System.out.printf("Saldo: R$%.2f%n", conta.saldo);
            System.out.println("----------");
        }
        System.out.println(" ");
    }
}
