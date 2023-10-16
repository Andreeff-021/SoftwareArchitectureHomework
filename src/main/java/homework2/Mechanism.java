package homework2;

public class Mechanism implements Lift {
    public void start() {
        System.out.println("Начать движение лифта");
    }
    public void stop() {
        System.out.println("Остановть движение лифта");
    }
}
