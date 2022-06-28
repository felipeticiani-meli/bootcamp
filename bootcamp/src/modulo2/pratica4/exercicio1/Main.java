package modulo2.pratica4.exercicio1;

import modulo2.pratica4.exercicio1.model.Basico;
import modulo2.pratica4.exercicio1.model.Cobrador;
import modulo2.pratica4.exercicio1.model.Executivo;

public class Main {
    public static void main(String[] args) {
        Executivo ex = new Executivo();
        ex.depositar();
        ex.transacaoOk();

        ex.transferir();
        ex.transacaoNaoOk();

        Basico basico = new Basico();
        basico.consultarSaldo();
        basico.pagarServico();
        basico.transacaoOk();
        basico.sacar();
        basico.transacaoOk();

        Cobrador cobrador = new Cobrador();
        cobrador.consultarSaldo();
        cobrador.sacar();
        cobrador.transacaoOk();
    }
}
