public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");         // Add to the end
        System.out.println(sb);      // Hello World

        sb.insert(5, " Java");       // Insert at position 5
        System.out.println(sb);      // Hello Java World

        sb.replace(6, 10, "C++");    // Replace Java with C++
        System.out.println(sb);      // Hello C++ World

        sb.reverse();                // Reverse the whole string
        System.out.println(sb);      // dlroW ++C olleH
    }
}



/*

🔧 Common Methods of StringBuilder
Method	What it does
append(str)	Adds str to the end
insert(pos, str)	Inserts str at position pos
replace(start, end, str)	Replaces part of string
delete(start, end)	Deletes characters between indexes
reverse()	Reverses the characters
length()	Returns the current length
capacity()	Returns current capacity (not fixed)










✅ Advantages of StringBuilder

Mutable – You can modify the string content.

Faster than StringBuffer – Because it’s not synchronized.

Efficient memory usage – Reuses memory for appending/modifying.


❌ Disadvantages
Not thread-safe – Shouldn’t be used in multi-threaded environments.

Can lead to bugs if multiple threads use the same StringBuilder object.

*/ 
