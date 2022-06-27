package modulo2.pratica4.exercicio3;

public class Main {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        vaca.emitirSom();
        vaca.comerPasto();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.comerCarne();
        gato.comerAnimal(vaca);

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.comerCarne();
        cachorro.comerAnimal(vaca);


    }

}
