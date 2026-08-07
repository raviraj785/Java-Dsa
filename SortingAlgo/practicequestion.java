public class practicequestion {

       static void display(int arr[] ){
        for(int val : arr){
            System.out.print(val+" ");

        }
        System.out.println();
       }    

       static void sortarray(int arr[]){
        int n = arr.length;
        int x = -1;
        int y = -1;
        if(n <= 0){
            return;
        }
        for(int i = 1; i < n ; i++){
            if (arr[i-1] > arr[i]) {
                if (x==-1) {
                    x = i-1;
                    y = i ;
                }
                else
                    y = i ;
            }
        } 
         int temp = arr[x];
         arr[x] =  arr[y];
         arr[y] = temp;

       }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4, 6, 7};
         sortarray(arr);
         display(arr);
    }
}
