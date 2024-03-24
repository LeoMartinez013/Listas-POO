package exerc9;
public class Transferencia {
    public void transferir(Cliente c1, Cliente c2, double quantia) {
        // Se a quantia é positiva
        if (quantia <= 0) {
            System.out.println("Quantia de transferência inválida.");
            return;
        }
        // Verifica se c2 possui saldo suficiente para transferir
        if (quantia > (c2.getSaldo() + c2.getLimite())) {
            System.out.println(c2.obterNome() + " não possui saldo suficiente para transferência.");
            return;
        }
        // Realiza a transferência
        c2.sacar(quantia);
        c1.depositar(quantia);
        // Exibe mensagem de conclusão da transferência
        System.out.println("Transferência de R$ " + quantia + " concluída.");
        System.out.println("De: " + c2.obterNome() + " Para: " + c1.obterNome());
    }
}
