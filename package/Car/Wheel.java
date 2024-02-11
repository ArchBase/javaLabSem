package Car;

public class Wheel {
    public boolean wheelState = false;
    public void rotateWheel(){
        System.out.println("The Wheel is rotating");
        this.wheelState = true;
    }
}