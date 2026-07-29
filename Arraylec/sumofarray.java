public class sumofarray {
    public static void sumofarrayy(){
       int arr[]= {1,2,3,
        4,5,6,7,8,9,10};
       int i;
       int sum =0;
       for(i=0;i<arr.length;i++){
        sum+=arr[i];
       }
       System.out.println(sum);
}
    public static void main(String[] args) {
        sumofarrayy();
    }
}
