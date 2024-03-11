package lista1.exerc1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", Sexo.MASCULINO, 17, false);
        Pessoa pessoa2 = new Pessoa("Maria", Sexo.FEMININO, 10, true);
        Pessoa pessoa3 = new Pessoa("Enzo", Sexo.MASCULINO, 2, false);

        Churrasco chrsc = new Churrasco();

        chrsc.verificarConsumo(pessoa1);
        chrsc.verificarConsumo(pessoa2);
        chrsc.verificarConsumo(pessoa3);
    }
}
