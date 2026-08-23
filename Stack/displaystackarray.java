import java.util.Scanner;
import java.util.Stack;

public class displaystackarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int n ;
        System.out.println("Enter the No of ELelment Yo Want to Insert ");
        n= sc.nextInt();
        System.out.println("Enter Elemnet");
        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        /* Display Using Normal Function */
    //     Stack<Integer> rt = new Stack<>();
    //     while (st.size() > 0 ) {
    //         rt.push(st.pop());
    //     }
    //    while (rt.size() > 0) {
    //      st.push(rt.pop());
    //    }
    //    System.out.println(st);

           /*   Display Using Array */
     int x = st.size();
     int arr [] = new int[n]; // Array Me value insert karenge Revrse order me
     for(int i = x-1 ; i>=0 ; i--){
        arr[i] = st.pop();
     }
     for(int i = 0 ; i < x; i++){
        System.out.print(arr[i] + " ");
        st.push(arr[i]);
     }
 

    }
}