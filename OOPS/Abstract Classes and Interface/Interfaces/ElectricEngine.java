public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Start the electric engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop the electric engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate the electric engine");
    }
    
}
