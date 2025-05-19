import java.util.ArrayList;
 
import java.util.Collections;

class Arraylist{
    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("Nano");
        cars.add("Bugati");
        cars.add("Mercedes");

        //insert element at specified indexes
        cars.add(0, "Mazda"); 
        cars.add(1, "Tiago"); 

        //access element:To access an element in the ArrayList, use the get() method and refer to the index number:
    //    System.out.println(cars.get(3));//Mazda

       //Modify:To modify an element, use the set() method and refer to the index number:
    //    cars.set(0,"Kia");


       //remove:To remove an element, use the remove() method and refer to the index number:
    //    System.out.println(cars.remove(0));

     //clear:removes all the data from the array list
        // cars.clear();
        // System.out.println(cars);

        //find size using cars.size();
        //write code here



        //loop through arraylist using for loop
        //write code here
        // for(int i=0;i<cars.size();i++){
        //     System.out.print(cars.get(i)+" ");
        // }
        // System.out.println();


        //loop through arraylist using for each loop
        //write code here

        // for(String i:cars){
        //     System.out.print(i+" ");
        // }



        //sort array based on the alphabetical order
        Collections.sort(cars);
        for(String i:cars){
            System.out.println(i);
        }


       // sort a list in reverse order, by using the reverseOrder() method
       //write your code here
       //1.Syntax:Collections.sort(cars,Collections.reverseOrder())
       //2. print then




    }
}