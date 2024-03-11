package exerc2;

import exerc2.Estado;

public class Lampada {
    Estado estado;
    int qtdAcendimentos;

    Lampada() {
        this.estado = Estado.APAGADA;
        this.qtdAcendimentos = 0;
    }
    void click() {
        if (this.estado == Estado.APAGADA) {
            this.estado = Estado.ACESA;
            this.qtdAcendimentos++; // Incrementa somente quando a lâmpada é acesa
        } else {
            this.estado = Estado.APAGADA;
        }
    }
    int qtdAcendimentos() {
        return this.qtdAcendimentos;
    }
    void checaEstado() {
        System.out.println("A lampada está " + estado);
    }
}
