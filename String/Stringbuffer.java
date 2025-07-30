public class Stringbuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");  // Add text to the end

        System.out.println(sb);  // Output: Hello World

        sb.insert(5, " Java");   // Insert text at position 5

        System.out.println(sb);  // Output: Hello Java World

        sb.replace(6, 10, "C++"); // Replace Java with C++

        System.out.println(sb);  // Output: Hello C++ World

        sb.reverse();           // Reverse the string

        System.out.println(sb); // Output: dlroW ++C olleH
    }


    
}



/*






📌 Key Methods in StringBuffer:
Method	What it does
append(str)	Adds str to the end
insert(pos, str)	Inserts str at position pos
replace(start, end, str)	Replaces characters from start to end with str
delete(start, end)	Deletes characters from start to end
reverse()	Reverses the characters
capacity()	Returns current capacity of buffer
length()	Returns the current length

✅ Advantages of StringBuffer:
Mutable – You can change the content without creating a new object.

Thread-safe – It is synchronized, meaning safe to use in multithreaded environments.

Efficient for many string modifications – Better than String when you're doing lots of changes.

❌ Disadvantages:
Slower than StringBuilder – Because it is synchronized.

More memory – Internally has extra capacity that may not be used.

Less readable – Slightly more complex to use than plain String.








*/