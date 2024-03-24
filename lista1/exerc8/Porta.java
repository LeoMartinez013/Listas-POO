package exerc8;
public class Porta {
    private boolean isOpen;
    private static int numAberturas;

    public Porta() {
        this.isOpen = false;
        this.numAberturas = 0;
    }
    public void abrir() {
        //  Se fechado
        if(!this.isOpen) {
            this.isOpen = true;
            numAberturas++;
        } else {
            System.out.println("A porta ja esta aberta.");
        }
    }
    public void fechar() {
        // Se aberto
        if(this.isOpen) {
            this.isOpen = false;
        } else {
            System.out.println("A porta ja esta fechada.");
        }
    }
    public static int getNumAberturas() {
        return numAberturas;
    }
}
