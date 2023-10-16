package homework2;

public class Facade {
    private Door door;
    private Mechanism mechanism;

    public Facade() {
        door = new Door();
        mechanism = new Mechanism();
    }
    public void startLift() {
        door.start();
        mechanism.start();
    }
    public void stoptLift() {
        mechanism.stop();
        door.stop();
    }
}
