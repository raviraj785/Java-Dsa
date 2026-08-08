public class GetterSetter {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setcolour("Blue");
        System.out.println(p.getcolour());
        p.settip(10);
        System.out.println(p.gettip());
    }
}
class Pen {
    private String colour;
    private int tip;

    void setcolour(String newcolour){
        this.colour = newcolour;
    }
    void settip(int tip){
        this.tip = tip;
    }
     String  getcolour(){
        return this.colour;
     }
     int gettip(){
        return this.tip;
     }
}