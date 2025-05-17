import java.util.Scanner;

class Student{
    String name;
    int age;

    Student(String _name,int _age){
    //    name = _name;
    //    age= _age;

    this.name = _name;
    this.age = _age;
    }
    void display(){
        System.out.println("My name is "+name+" and i am "+age+" years old");
    }
}
class Demo{
    public static void main(String[] args) {
        Student st = new Student("Itihas",21);

        st.display();
    }
}