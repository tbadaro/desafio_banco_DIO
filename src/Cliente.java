import java.util.ArrayList;
import java.util.List;

public class Cliente {

    protected enum TipoPessoa {
        PESSOA_FISICA,
        PESSOA_JURIDICA
    }

    private static int SEQ_PF = 1;
    private static int SEQ_PJ = 1;

    protected String identificador;
    protected String nome;
    private List<Conta> contas;
    protected TipoPessoa tipoPessoa;

    public Cliente(String nome, TipoPessoa tipoPessoa){
        if(tipoPessoa == TipoPessoa.PESSOA_FISICA){
            this.identificador = "PF_"+SEQ_PF++;
        } else if (tipoPessoa == TipoPessoa.PESSOA_JURIDICA) {
            this.identificador = "PJ_" + SEQ_PJ++;
        }
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
