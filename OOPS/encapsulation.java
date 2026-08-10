public class encapsulation {
    public static void main(String[] args) {
        b r = new b();
        r.setvalue(20);
       System.out.println( r.getvalue());
    }
}
class b{
    private int value ;
    public void setvalue(int x){
        value = x ;
    }
    public int getvalue(){
        return value;
    }
}
