public class Main {
    public static void main(String args[]) {
        // Car car = new Car();
        // car.accelerate();
        // car.start();
        // car.stop();
        // car.brake();
        // System.out.println(car.a);



        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

        car.upgradeEngine(new ElectricEngine());
        car.start();
        car.startMusic();
    }    
}

// Interface basically contains abstract functions that is the function whose body is not defined only its signature is declared.
// It is like class only but not completely.
// It's object cannot be created.
// Variables are static and final, By default in Interfaces. Because there is not constructor in interface so how will the varibles will be initialized. That why it is final because final are initialized when it is declared.    
// Interfaces mostly specifies what the class is doing and not how it is doing it.
// Multiple inheritance is achieved using Interfaces in order to avoid diamond problem caused due to name ambiguity using class.
// Abstract class can provide the implementation of Interface whereas Interface cannot provide the implementation of abstract class.
// For Interface we use implements keywordsand for clases we use extends keyword.
// We can implement multiple interfaces together.
// An interface can also extend other single ot multiple Java interfaces, whereas A class can extend only single another class.
// In Interfaces, we can also extend annother interfaces.
