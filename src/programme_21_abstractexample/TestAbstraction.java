package programme_21_abstractexample;

public class TestAbstraction {

    public static void main(String[] args) {
        Shape s = new Circle();
        Shape s1 = new Rectangle();
        s.draw();
        s1.draw();
    }
}
