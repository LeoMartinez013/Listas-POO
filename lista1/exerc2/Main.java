package exerc2;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.click();
        lampada.checaEstado();
        lampada.click();
        lampada.click();
        lampada.click();
        lampada.click();
        lampada.click();
        lampada.click();
        lampada.checaEstado();
        lampada.qtdAcendimentos();
    }
}
