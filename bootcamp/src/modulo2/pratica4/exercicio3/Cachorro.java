package modulo2.pratica4.exercicio3;

public class Cachorro extends Animal implements Carnivoros {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");

    }

    @Override
    public void comerCarne() {
        System.out.println("Cachorro está comendo carne.");
    }

}
