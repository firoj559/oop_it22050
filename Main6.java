interface Firoj {
    void makeNoise();
}

class Kitten implements Firoj {
    public void makeNoise() {
        System.out.println("Meow");
    }
}

public class Main6 {
    public static void main(String[] args) {
        Kitten kittenObj = new Kitten();
        kittenObj.makeNoise();
    }
}
