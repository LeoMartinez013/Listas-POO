public class Churrasco {
    double qtdCarne;
    void verificarConsumo(Pessoa pessoa) {
        if (pessoa.vegetariana) {
            System.out.println(pessoa.nome + " não consome carne.");
        } else if (pessoa.idade <= 3) {
            System.out.println(pessoa.nome + " não consome carne.");
        } else {
            qtdCarne = pessoa.idade <= 12 ? 1.0 : 2.0;
            System.out.println(pessoa.nome + " consome " + qtdCarne + " kilos de carne.");
        }
    }
}
