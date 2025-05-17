import java.util.Scanner;

class Pen{
    String color;
    String type; //gel,ballpoint

    void write(){
        System.out.println("I have the ability to write");
    }
    void kill(){
        System.out.println("I can kill with my pointy end");
    }

    public void printColor(){
        System.out.println("Color: "+ this.color);
    }

    public void printType(){
        System.out.println("Type: "+ this.type);
    }
};

class Student{
    String name;
    int age;
    String city;
    

    //default constructor
    // Student(){
    //     System.out.println("Constructor called");
    // }

    //parameterized constructor
    Student(String name,int age,String city){ 
        this.name = name;
        this.age = age;
        this.city = city;
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        this.city = s2.city;
    }
    void printInfo(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.age);
        System.out.println("City: "+ this.city);
        
    }
}

class Oops{
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.color="red";
        // p1.type = "gel";

        // p1.write();
        // p1.kill();
        // p1.printColor();
        // p1.printType();

        
        Student s1 = new Student("Itihas",23,"Nawada");
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();





    }
}