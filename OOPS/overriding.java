public class overriding {
    public static void main(String[] args) {
        shape ref = new square();
        ref.draw();
    }
}
class shape{
    void draw(){
        System.out.println("Cant Sya Shape Size");

    }
}
class square extends shape{
     @Override
     void draw(){
        super.draw();
        System.out.println("Squre shape");
     }

}