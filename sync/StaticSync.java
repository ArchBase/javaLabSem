import java.util.*;

class Resource{
    static synchronized void requestResource(String name){
        for(int i=0; i<5; i++){
            System.out.println("Resource requested by: "+name);
        }
    }
}

class Spotify extends Thread{
    Resource os;
    Spotify(String name){
        this.os = new Resource();
        this.setName(name);
    }
    public void run(){
        this.os.requestResource(Thread.currentThread().getName());
    }
}

class Chrome extends Thread{
    Resource os;
    Chrome(String name){
        this.os = new Resource();
        this.setName(name);
    }
    public void run(){
        this.os.requestResource(Thread.currentThread().getName());
    }
}

public class StaticSync {

    public static void main(String[] args) {
        Spotify sp = new Spotify("spotify");
        Chrome ch = new Chrome("chrome");

        sp.start();
        ch.start();
    }
}

