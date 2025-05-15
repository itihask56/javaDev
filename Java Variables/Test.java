//varialbe is the name of a memory location
class Test{
    int a = 10; //instance vairable ->inside the main class and outside any method
    static int c= 20; //static var->this can be called without using obj
    public static void main(String[] args) {
        int d = 40; //local variable
        final int B = 20; //final variable->value can't be changed

        Test t = new Test(); //object creation
        System.out.println("instance variable: "+t.a);
        System.out.println("Static variable: "+c);
        System.out.println("Final Variable: "+B);
        System.out.println("Local variable: "+d);
       
    }
}