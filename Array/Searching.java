import java.util.Scanner;
class Searching{

    static int linearSearch(int []arr,int key,int size){
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr={2,6,3,8,9};
        int key;
        System.out.println("Enter key to search: ");
        key = sc.nextInt();

        int result = linearSearch(arr,key,arr.length);
        System.out.println(key+ " is found at index "+result);

    }
}