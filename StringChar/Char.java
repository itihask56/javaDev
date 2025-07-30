import java.util.Scanner;
class Char{
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        c = sc.next().charAt(0); 
        System.out.println(c);
    }
}