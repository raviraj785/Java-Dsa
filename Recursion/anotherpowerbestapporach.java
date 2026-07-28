public class anotherpowerbestapporach {
    static int pow(int p , int q){
        if(q==0) return 1;

        int smallanswer = pow(p, q/2);
        if(q%2==0)
        {
          return smallanswer * smallanswer;
        }
        else{
            return p * smallanswer  * smallanswer ;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(5,3));
    }
}
