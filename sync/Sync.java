import java.util.*;

class Resource{
    synchronized void requestResource(String name){
        System.out.println("Resource requested by: "+name);
    }
}

class Spotify extends Thread{
    Resource os;
    Spotify(Resource os, String name){
        this.os = os;
        this.setName(name);
    }
    public void run(){
        this.os.requestResource(Thread.currentThread().getName());
    }
}

class Chrome extends Thread{
    Resource os;
    Chrome(Resource os, String name){
        this.os = os;
        this.setName(name);
    }
    public void run(){
        this.os.requestResource(Thread.currentThread().getName());
    }
}


/**
 * Sync
 */
public class Sync {

    public static void main(String[] args) {
        Resource os = new Resource();
        Spotify sp = new Spotify(os, "spotify");
        Chrome ch = new Chrome(os, "chrome");

        sp.start();
        ch.start();
    }
}

