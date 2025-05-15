import java.util.Scanner;
class CheckVowel{
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);

      
        boolean flag = true;
        while(flag){
            System.out.println("Enter char to check vowel:");
            ch=sc.next().charAt(0);
            if(ch=='a'||ch=='i'|| ch == 'o'|| ch == 'e'||ch == 'u'){
                System.out.println(ch+ " is a vowel");
                flag=false;

            }
            else{
                System.out.println(ch+ " is a consonant");
            }
        }
    }
    

}