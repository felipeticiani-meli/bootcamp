package modulo2.pratica4.exercicio3;

public class Gato extends Animal implements Carnivoros {

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void comerCarne() {
        System.out.println("Gato está comendo carne.");
    }

    @Override
    public void comerAnimal(Animal animal) {
        System.out.println("Gato está comendo " + animal.getClass().getSimpleName());
    }
}
