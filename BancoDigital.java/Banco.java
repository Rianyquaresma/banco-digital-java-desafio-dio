import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    // Construtor
    public Banco() {
        this.contas = new ArrayList<>();
    }

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    // Método para adicionar contas ao banco
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Método para buscar contas de um cliente específico
    public Conta buscarConta(Cliente cliente) {
        for (Conta conta : contas) {
            if (conta.titular.equals(cliente)) {
                return conta;
            }
        }
        return null;
    }
}
