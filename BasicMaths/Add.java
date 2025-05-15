public class Add{
    int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Add a = new Add();
       int result =  a.sum(2,3);
       System.out.println("Sum: "+result);
       int subtraction = sub(5,2);
       System.out.println("Subtraction: "+subtraction);
    }
}