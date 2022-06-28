package modulo2.pratica4.exercicio1.model;

import modulo2.pratica4.exercicio1.interfaces.ConsultaDeSaldo;
import modulo2.pratica4.exercicio1.interfaces.SaqueEmDinheiro;

public class Cobrador implements SaqueEmDinheiro, ConsultaDeSaldo {
    @Override
    public void consultarSaldo() {
        System.out.println("O saldo é: ");
    }

    @Override
    public void sacar() {
        System.out.println("Sacando dinheiro...");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transação ok...");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação não ok...");
    }
}