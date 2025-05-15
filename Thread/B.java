//Multithreading
class A extends Thread {
   
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Itihas");
                Thread.sleep(1000);
            } 
        } catch(InterruptedException i) {
             
        }
        
    }
}


public class B {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("verma");
            Thread.sleep(1000);
        }
    }
}


//signlethreading
// class A extends Thread {
   
//     public void fun() {
//         try {
//             for (int i = 0; i < 5; i++) {
//                 System.out.println("Itihas");
//                 Thread.sleep(1000);
//             } 
//         } catch(InterruptedException i) {
             
//         }
        
//     }
// }

// public class B {
//     public static void main(String[] args) throws InterruptedException {
//         A t = new A();
//         t.fun();
//         for (int i = 0; i < 5; i++) {
//             System.out.println("verma");
//             Thread.sleep(1000);
//         }
//     }
// }