// public interface arrayy {
//  public static void main(String[] args) {
//     int a[]={10,20,30,40,50};
//     System.out.println(a[4]);
//  }    
// }
//another example
// public class arrayy {
//  public static void main(String[] args) {
//     int a[]=new int[5];
//     a[0]=10;
//     a[1]=20;
//     a[2]=30;
//     a[3]=40;
//     a[4]=50;
//     System.out.println(a[3]);
//  }    
// }
//ONE MORE 
import java.util.Scanner;
public class arrayy {
 public static void main(String[] args) {
// int size ,i;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter The Size Of Array");
 int size = sc.nextInt();
 int a[]=new int[size];
 for(int i= 0;i<size;i++){
   a[i]=sc.nextInt();

 }
 System.out.println("Printed Element");
// for(i=0;i<size;i++){
for(int b :a){
    // System.out.println(a[i]);
    System.out.println(b);
 }
 }
}