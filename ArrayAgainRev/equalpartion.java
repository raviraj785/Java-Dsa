public class equalpartion {

    public static int  findtotlesum(int arr[]){
        int totlesum = 0;
        for(int i =0 ; i< arr.length ; i++){
          totlesum+=arr[i];
        }
        return totlesum;
    }

    public static boolean equalpartionn(int arr[]){
        int totlesum = findtotlesum(arr);

        int prisum = 0;
        for(int i =0 ; i< arr.length ; i++){
            prisum+=arr[i];
        int suffixsum = totlesum -prisum;
        
        if (suffixsum==prisum) {
            return true;
        } 

        }
        return false;

    }

 public static void main(String[] args) {
     int arr[]= {2,3,5};
     System.out.println(equalpartionn(arr));
 }
}
