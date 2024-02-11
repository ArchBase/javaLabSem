class Animal{
    void makeSound(){
        System.out.println("........");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow");
    }
}

/**
 * poly
 */
public class poly {

    public static void main(String[] args) {
        Animal cat;
        cat = new Cat();
        cat.makeSound();
    }
}