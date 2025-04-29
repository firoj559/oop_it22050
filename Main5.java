abstract class Creature {
    abstract void produceSound();

    void rest() {
        System.out.println("Resting...");
    }
}

class Puppy extends Creature {
    void produceSound() {
        System.out.println("Bark Bark");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Puppy puppyObj = new Puppy();
        puppyObj.produceSound();
        puppyObj.rest();
    }
}
