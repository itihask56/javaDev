import java.util.Scanner;

// Single Inheritance

//Base class (parent)
// class Animal{
//     String color;

//     public void eat(){
//         System.out.println("Animal can eat");
//     }
// };

// //Derived class (Child)

// class Dog extends Animal{

//     void bark(){
//         System.out.println("Dogs can bark");
//     }
// }


// class Inheritance{
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.bark();
//         dog.eat();

        
//     }
    
// }




//Multilevel Inheritance

//Base class (parent)
// class Animal{
    
//     public void eat(){
//         System.out.println("Animal can eat");
//     }
// };

// //Derived class (Child)

// class Mammal extends Animal{

//     void birth(){
//         System.out.println("Mammal Can give birth");
//     }
// }

// class Cat extends Mammal{
//     void meow(){
//         System.out.println("Cat is mewing");
//     }
// }


// class Inheritance{
//     public static void main(String[] args) {
//       Cat cat = new Cat();
//       cat.eat();
//       cat.birth();
//       cat.meow();


        
//     }
    
// }











//hierarcheal inheritance

//Base class (parent)
// class Animal{
    
//     public void eat(){
//         System.out.println("Animal can eat");
//     }
// };

// //Derived class (Child)

// class Dog extends Animal{

//     void bark(){
//         System.out.println("Dog can bark");
//     }
// }

// class Cat extends Animal{
//     void meow(){
//         System.out.println("Cat is mewing");
//     }
// }


// class Inheritance{
//     public static void main(String[] args) {
//       Cat cat = new Cat();
//       cat.meow();
//       cat.eat();


//       Dog dog = new Dog();
//       dog.bark();
//       dog.eat();
       


        
//     }
    
// }


//




// Multiple Inheritance using interface

// interface Animal{
//     void eat();
// }
// interface Pet{
//     void play();
// }

// class Dog implements Animal,Pet{
//     public void eat(){
//         System.out.println("Dog can eat");
//     }
//     public void play(){
//         System.out.println("Dog can play");
//     }
// }


// class Inheritance{
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat();
//         dog.play();
//     }
// }




// Hybrid Inheritance


interface Animal{
    void eat();

}

//Hierarchial Inheritance
interface Pet extends Animal{
    void play();
}

//Hierarchial Inheritance
interface Wild extends Animal{
    void hunt();
}
// Class implementing multiple interfaces (Multiple Inheritance)

class Dog implements Pet{
    public void eat(){
        System.out.println("Dog is eating");

    }
    public void play(){
        System.out.println("Dog is playing");
    }
}

// Class implementing another interface
class Lion implements Wild{
    public void hunt(){
        System.out.println(" Lion is hunting");
    }
    public void eat(){
        System.out.println("Lion is eating");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Lion lion = new Lion();
        
        System.out.println("Dog:");
        dog.eat();
        dog.play();
        
        System.out.println("\nLion:");
        lion.eat();
        lion.hunt();
    }
}