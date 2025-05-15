class A{
     static void show(){ //if a member func are non static,then it can be called by making obj of the class
        //if it is static then we can call it directly
        System.out.println("its a void show function");
    }

    public static void main(String []args){
        // A obj = new A();
        // obj.show();
        show();
        System.out.println("Hello World");
    }
};
