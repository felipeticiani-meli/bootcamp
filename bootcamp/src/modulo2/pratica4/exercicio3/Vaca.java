package modulo2.pratica4.exercicio3;

public class Vaca extends Animal implements Herbivoros {
    @Override
    public void emitirSom() {
        System.out.println("Muuu!");
    }

    @Override
    public void comerPasto() {
        System.out.println("Vaca está pastando.");
    }
}
