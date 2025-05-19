//A HashMap stores key-value pairs, which are great when you want to store values and find them by a key (like a name or ID):

import java.util.HashMap;

class Hashmap{
    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String,String>();
        capitalCities.put("India", "Delhi");
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        // System.out.println(capitalCities);


        //access item using get method
        //System.out.println(capitalCities.get("England"));

        //delete item using remove method: remove()
        //write your code here


        //clear(): remove all the items in hashmap
        //write your code here


        //size(): find size of hashmap
        // write your code here


        //loop through hashmap by using for each loop
        //Use the keySet() method if you only want the keys, and use the values() method if you only want the values

        //print keys
        // for(String i:capitalCities.keySet()){
        //     System.out.print(i+" ");
        // }

        //print values
        // for(String i:capitalCities.values()){
        //     System.out.print(i+" ");
        // }


        //print keys and values together
        for(String i:capitalCities.keySet()){
            System.out.print("Keys: "+i+" Values: "+capitalCities.get(i));
        }








    }
}