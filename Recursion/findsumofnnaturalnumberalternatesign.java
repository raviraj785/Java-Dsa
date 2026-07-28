public class findsumofnnaturalnumberalternatesign {
    public static int naaturalalternatealterign(int n){
     if(n==0){
        return 0;
     }
     if(n%2==0){
        return naaturalalternatealterign(n-1) -n;

     }
     else{
        return naaturalalternatealterign(n-1) + n;
     }
    }
    public static void main(String[] args) {
        System.out.println(naaturalalternatealterign(5));
    }
}
