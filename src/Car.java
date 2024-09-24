public class Car extends Vehicle
{
    @Override
    public void accelerate() {
        System.out.println("Press the gas pedal");
    }

    @Override
    public void stop() {
        System.out.println("Break");
    }

    @Override
    public void start() {
        System.out.println("Start car");
    }
}
