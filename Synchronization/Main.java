//inconsistent output 
// class Table{
//     public void printTable(int n){
//         for(int i =1;i<=10;i++){
//             System.out.println(n*i);
//         }
//     }
// }

// class thread1 extends Thread{
//     Table t;
//     thread1(Table t){
//         this.t = t;

//     }
//     public void run(){
//         t.printTable(5);
//     }
// }

// class thread2 extends Thread{
//     Table t;
//     thread2(Table t){
//         this.t = t;

//     }
//     public void run(){
//         t.printTable(6);
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         Table obj = new Table();
//         thread1 t1 = new thread1(obj);
//         thread2 t2 = new thread2(obj);

//         t1.start();
//         t2.start();
//     }
    
// }


//consistent output if we use synchronised method

// class Table{
//     public synchronized void printTable(int n){
//         for(int i =1;i<=10;i++){
//             System.out.println(n*i);
//         }
//     }
// }

// class thread1 extends Thread{
//     Table t;
//     thread1(Table t){
//         this.t = t;

//     }
//     public void run(){
//         t.printTable(5);
//     }
// }

// class thread2 extends Thread{
//     Table t;
//     thread2(Table t){
//         this.t = t;

//     }
//     public void run(){
//         t.printTable(6);
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         Table obj = new Table();
//         thread1 t1 = new thread1(obj);
//         thread2 t2 = new thread2(obj);

//         t1.start();
//         t2.start();
//     }
    
// }


class msg{

    ;;;;//100 lines of code

    //method level synchronization
    // public synchronized void show(String name){
    //     for(int i =0;i<3;i++){
    //         System.out.println("Hii I am "+name);
    //     }
    // }


    public void show(String name){
        ;;;;;//100 lines of code
        //block level synchronizaion
        synchronized(this){
            for(int i =0;i<3;i++){
                System.out.println("Hii I am "+name);
            }


        }
        ;;;;;//100 lines of code
       
    }

    
}

class OurThread extends Thread{
    msg m;
    String name;

    OurThread(msg m,String name){
        this.m = m;
        this.name = name;
    }
    public void run(){
        m.show(name);
    }

}

class Main{
    public static void main(String[] args) {
        msg m = new msg();
        OurThread t1 = new OurThread(m,"itihas");
        OurThread t2 = new OurThread(m,"verma");
        t1.start();
        t2.start(); 
    }
    
}