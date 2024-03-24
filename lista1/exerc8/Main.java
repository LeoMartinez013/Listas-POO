package exerc8;
public class Main {
    public static void main(String[] args) {
        Porta p1 = new Porta();
        Porta p2 = new Porta();
        System.out.println("Numero de aberturas: " + Porta.getNumAberturas());
        //  retorna 0
        p1.abrir();
        System.out.println("Numero de aberturas: " + Porta.getNumAberturas());
        //  retorna 1
        p2.abrir();
        p1.fechar();
        p1.abrir();
        p1.fechar();
        System.out.println("Numero de aberturas: " + Porta.getNumAberturas());
        //  retorna 3
    }        
}