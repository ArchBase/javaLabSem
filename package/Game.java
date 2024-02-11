import Car.Wheel;
import Car.Body;
import Builder.BuildCar;

public class Game {
    public static void main(String[] args) {
        Wheel w = new Wheel();
        Body b = new Body();
        BuildCar c = new BuildCar();

        c.buildCars(b, w);

    }
}
