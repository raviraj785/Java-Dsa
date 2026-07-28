public class chagearray {
    public static void changeArray(int [] arr){
        for(int i= 0;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr= new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        
        changeArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    
}
