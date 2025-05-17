class Student{
    String name;
    int age;
     
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    void printInfo(String name){
        System.out.println(name);
        
    }

    void printInfo(int age){
        System.out.println(age);
        
    }

     void printInfo(String name,int age){
        System.out.println(name+ " "+ age);
        
    }
};

class Polymorphism{
    public static void main(String[] args) {
        
        
        Student s1 = new Student("Poonam",23);
        s1.printInfo("Itihas");
        s1.printInfo(23);
        s1.printInfo("Itihas",23);
        


    }
}