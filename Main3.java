class raj {
    protected String category = "Creature";

    void show() {
        System.out.println("This is a creature.");
    }
}

class r extends raj {
    void makeSound() {
        System.out.println(category + " says Firoj!");
    }
}

public class Main3 {
    public static void main(String[] args) {
        r rObj = new r();
        rObj.show();
        rObj.makeSound();
    }
}
