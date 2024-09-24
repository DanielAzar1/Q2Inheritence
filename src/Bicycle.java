public class Bicycle extends Vehicle
{
    @Override
    public void accelerate() {
        System.out.println("Pedal");
    }

    @Override
    public void start() {
        System.out.println("Start to pedal");
    }

    @Override
    public void stop() {
        System.out.println("stop pedalling");
    }
}
