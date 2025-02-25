public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-00");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(contaPoupanca, 200);

        System.out.println("Saldo João: " + contaCorrente.getSaldo());
        System.out.println("Saldo Maria: " + contaPoupanca.getSaldo());
    }
}
