public class countelement {
    public static void main(String[] args) {
        int arr[]= new int[5];
        arr[0]=1;
        arr[1]=1;
        arr[2]=3;
        arr[3]=3;
        arr[4]=1;
         int couunt=0;
         int x=1;
         for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                couunt++;
            }
         }
          System.out.println(couunt);
    }
}
