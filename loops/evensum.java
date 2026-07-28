public class evensum {
    public static void main(String[] args) {
        int n=123456;
      
        int lastdigit;
  int sum=0;
        while (n!=0) {
            lastdigit=n%10;
            if(lastdigit%2==0){
                sum=sum+lastdigit;
            }
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
