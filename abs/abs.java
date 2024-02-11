

abstract class Top{
    abstract void openTop();
    public void closeTop(){
        System.out.println("Top closed");
    }
}

class Car extends Top{
    void openTop(){
        System.out.println("Top opened");
    }
    void animate(){
        openTop();
        closeTop();
    }
}

/**
 * abs
 */
public class abs {

    public static void main(String[] args) {
        Car c = new Car();
        c.animate();
    }
}


