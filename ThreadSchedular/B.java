//Multithreading
class A extends Thread {
   
    public void run() {
        
        String n = Thread.currentThread().getName();
        
            for (int i = 0; i < 3; i++) {
                System.out.println(n);
            } 
        
    }
}

public class B {
    public static void main(String[] args) throws InterruptedException {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
         
    }
}
