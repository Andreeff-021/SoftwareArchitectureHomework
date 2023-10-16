package homework2;

public class Program {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startLift();
        System.out.println();
        facade.stoptLift();
    }
}
