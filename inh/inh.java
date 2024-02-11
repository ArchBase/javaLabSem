class Person{
    int age;
    void show(){
        System.out.println("hey there im human");
    }
}

class Student extends Person{
    
    int rollno;
}

class Teacher extends Person{
    int tid;
}

/**
 * inh
 */
public class inh {

    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}