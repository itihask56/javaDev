import java.util.Scanner;
class PrintArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Size of Array");
        n = sc.nextInt();

        //initialize array with size n
        int []arr=new int[n];
        System.out.println("Enter Array's Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}