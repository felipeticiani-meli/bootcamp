package modulo2.pratica4.exercicio1.model;

import modulo2.pratica4.exercicio1.interfaces.Deposito;
import modulo2.pratica4.exercicio1.interfaces.Transferencia;

public class Executivo implements Deposito, Transferencia {

    @Override
    public void depositar() {
        System.out.println("Depositando...");
    }

    @Override
    public void transferir() {
        System.out.println("Transferindo...");
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
