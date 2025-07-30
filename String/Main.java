import java.util.*;
class Main{
    public static void main(String[] args) {
        // String str = new String("itihas verma");
        // System.out.println(str);
        // //System.out.println(str[0]);  //invalid we can't access using index
        // System.out.println(str.charAt(0));
        // System.out.println("Length of string:"+str.length());
        // System.out.println(str.charAt(12));






         // Case 1: String literals
        String a = "itihas";
        String b = "itihas";
        
        System.out.println(a == b); 
        // ✅ true
        // Both 'a' and 'b' refer to the same object in the String Pool.
        // String literals are automatically interned by Java.
        // So, both variables point to the same memory location in the string pool.

        // Case 2: Using 'new' keyword
        String name1 = new String("itihas");
        String name2 = new String("itihas");

        System.out.println(name1 == name2); 
        // ❌ false
        // 'new' keyword creates a new String object in the heap memory each time.
        // So, name1 and name2 refer to two different objects,
        // even though their contents (characters) are the same.

        System.out.println(name1.equals(name2));
        // ✅ true
        // .equals() checks the actual contents of the strings
    }
}




/*

✅ Key Concepts:
Concept	Explanation
String Pool	A special memory area in the heap where string literals are stored. Java reuses these to save memory.
== operator	Compares references (i.e., memory addresses), not the content.
.equals() method	Compares contents/values of the strings.
new String("...")	Always creates a new object in the heap, separate from the String Pool.

💡 Tip:
Always use .equals() when comparing string contents, not ==, unless you're sure the references should match.
*/ 