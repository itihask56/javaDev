import java.util.Scanner;

//Scaner is a predefined class in java.it is available in java.util package which is used to take input

//Rule1: import scanner package at the top of the program

//Rule2: first we need to create object of scanner class
//syntax: Scanner obj_name = new Scanner(System.in)

//Rule3: Scanner class methods
// nextLine() -> string
// nextInt() -> interger
// nextFload()->float
// nextBoolean()->Boolean
// nextDouble() -> double

//Rule4 : wrong input->Error: inputMissmatch exception
class Input{
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        a=sc.nextInt();
        b=sc.nextInt();
        int result = sum(a,b);
        System.out.println("Sum: "+result);

    }
}