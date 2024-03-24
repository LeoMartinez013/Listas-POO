package exerc9;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João", 1200.00, 500.00);
        Cliente c2 = new Cliente("Maria", 2000.00, 1000.00);

        c1.checarSaldo();
        c2.checarSaldo();

        Transferencia transferencia = new Transferencia();
        transferencia.transferir(c1, c2, 800.00);

        c1.checarSaldo();
        c2.checarSaldo();
    }
}
