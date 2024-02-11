class Waste{
    int a=92;
    public void finalize(){
        System.out.println("Obeject is garbage collectedk");
    }
}


/**
 * a
 */
public class a {

    public static void main(String[] args) {
        Waste a = new Waste();
        System.out.println(a.a);
        a = null;
        System.gc();
        //System.out.println(a.a);
    }
}
