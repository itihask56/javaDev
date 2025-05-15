import java.util.Scanner;
class Char{
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        c = sc.next().charAt(1); //taking character as a input
        System.out.println(c);
    }
}