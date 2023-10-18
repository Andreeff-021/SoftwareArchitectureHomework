package homework3;

public class CarWash implements Wash{

    public void processWash(WashType washType, Car car) {
        switch (washType) {
            case Regular -> System.out.printf("У автомобиля %s вымыты кузов и коврики \n", car.getNumber());
            case Comprehensive -> System.out.printf("Комплексная мойка автомобиля %s\n", car.getNumber());
        }
    }

    @Override
    public void wash(WashType washType, Car car) {
        processWash(washType, car);
    }
}
