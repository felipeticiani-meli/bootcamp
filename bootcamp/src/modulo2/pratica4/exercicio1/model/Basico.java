package modulo2.pratica4.exercicio1.model;

import modulo2.pratica4.exercicio1.interfaces.ConsultaDeSaldo;
import modulo2.pratica4.exercicio1.interfaces.PagamentoDeServicos;
import modulo2.pratica4.exercicio1.interfaces.SaqueEmDinheiro;

public class Basico implements ConsultaDeSaldo, PagamentoDeServicos, SaqueEmDinheiro {
    @Override
    public void consultarSaldo() {
        System.out.println("O saldo é: ");
    }

    @Override
    public void pagarServico() {
        System.out.println("Pagando serviço...");
    }

    @Override
    public void sacar() {
        System.out.println("Sacando em dinheiro...");
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
