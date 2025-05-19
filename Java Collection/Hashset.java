//A HashSet is a collection where every element is unique - no duplicates are allowed.

import java.util.HashSet;

class Hashset{
    public static void main(String[] args) {
        HashSet<String>cars=new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
    }
}