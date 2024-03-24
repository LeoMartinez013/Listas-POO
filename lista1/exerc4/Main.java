package exerc4;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João", 1200.00, 500.00);
        c1.checarSaldo();
        c1.sacar(1500.00);
        c1.checarSaldo();
        c1.depositar(600);
        c1.checarSaldo();
        System.out.println("Proprietario da conta: " + c1.obterNome());
    }
}
