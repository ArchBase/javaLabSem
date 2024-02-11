

interface Top{
    public void openTop();
    public void closeTop();
}

class Car implements Top{
    public void openTop(){
        System.out.println("Top opened");
    }
    public void closeTop(){
        System.out.println("Top closedi");
    }
    void animate(){
        openTop();
        closeTop();
    }
}

/**
 * abs
 */
public class intfc {

    public static void main(String[] args) {
        Car c = new Car();
        c.animate();
    }
}


