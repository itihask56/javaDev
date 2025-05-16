import java.util.Scanner;
class Factorial{
    static int factorial(int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num you want to find factorial:");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial: "+result);
    }
}