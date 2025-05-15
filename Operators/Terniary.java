import java.util.Scanner;
class Terniary{
    public static void main(String []args){
        System.out.println("Enter num a and b: ");
        int a,b,Max;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

       Max= (a>b)?a:b;
       System.out.print(Max);
    }
}