public class arrayelement {
    public static void main(String[] args) {
        int a[]= new int[5];
        a[0]=10;
        a[1]=0;
        a[2]=20;
        a[3]=30;
        a[4]=10;
        for(int b : a){
            System.out.println(b);
        }
    }
}
