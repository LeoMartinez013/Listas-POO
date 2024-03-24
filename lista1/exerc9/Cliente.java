package exerc9;
public class Cliente {
    private String nome;
    private double saldo, limite;
    Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void sacar(double saque) {
        //  Valida se o valor de saque é positivo
        if (saque<=0) {
            System.out.println("Valor de saque invalido");
            return;
        }
        //  Se saque seja menor que saldo + limite
        if(saque<=(saldo+limite)){
            // Se saque for maior que apenas o saldo
            if(saque>saldo) {
                // O usuário utilizará o crédito
                limite = limite - (saque - saldo);
                System.out.println("R$ " + (saque - saldo) + " descontado de seu limite de credito.");
                saldo = 0.0;
            } else {
                // O usuário utilizará apenas o saldo
                saldo = saldo - saque;
                System.out.println("Saque efetuado com sucesso. Você possui R$ " + saldo);
            }
        } else {
            // O saldo + limite será insuficiente para o saque
            System.out.println("Saldo e limite insuficientes. Você possui R$ " + saldo);
        }
    }
    public void depositar(double deposito) {
        if (deposito<=0) {      //  Valida se o valor de depósito é positivo
            System.out.println("Valor de deposito invalido");
            return;
        } else {
            //  Deposito concluido
            saldo = saldo + deposito;
            System.out.println("Valor depositado com sucesso.");
        }
    }
    public void checarSaldo() {
        System.out.println("Seu saldo é de R$ " + saldo);
        System.out.println("Seu limite é de R$ " + limite);
    }
    public String obterNome() {
        return nome;
    }
}