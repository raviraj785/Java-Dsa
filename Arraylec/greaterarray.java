public class greaterarray {
    public static void  greater(){
       int arr[]= {1,2,3,4,5,6,89,8,9,10};
       int i;
       int ans =0;
       for(i=0;i<arr.length;i++){
       if(arr[i] > ans){
        ans=arr[i];
     }
       
}
 System.out.println(ans);
}
    public static void main(String[] args) {
       greater();
    }

}