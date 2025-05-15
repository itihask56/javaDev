class ForEach{
    public static void main(String[] args) {
        int [] arr={2,5,3,8,9,1};
        // int size = sizeof(arr)/sizeof(arr[0]); it valid only in c++
        //java directly provide arr.length property to calculatae size

        for(int i:arr){
            System.out.println(i);
        }
   
    }
}