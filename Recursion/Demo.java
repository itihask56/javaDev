import java.util.Scanner;

class Demo{
    static void printNum(int n){
        if(n==0){
            return ;
        }
      
        printNum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        printNum(num);
    }
}