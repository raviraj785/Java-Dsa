public class fibonacci {
    public static int findfib(int n ){
         if(n==0) return 0;
         if(n==1) return 1;
         return findfib(n-1) + findfib(n-2);
         
    }
    public static void main(String[] args)
     {
        for(int i = 0 ; i <= 20 ; i++){
       System.out.print(findfib(i) + " ");
        }
    }
}
