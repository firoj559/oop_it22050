interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Raju is flying...");
    }

    public void swim() {
        System.out.println("firoj is swimming...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bird birdObj = new Bird();
        birdObj.fly();
        birdObj.swim();
    }
}
