import java.util.Arrays;
import java.util.Scanner;
class StringArray{
    public static void main(String[] args) {
        String [] arr={"itihas","poonam","kajal","arya","sitam"};

        //1st way to print the array
        // for(int i=0;i<arr.length;i++){
        //  System.out.print(arr[i]+" ");
        // }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.asList(arr));

    }
}