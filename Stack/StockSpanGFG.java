import java.util.Stack;

public class StockSpanGFG {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr []= {100, 80,60 ,70,60,75,85};
        int n = arr.length;
        int res [] = new int[n];
        for(int i= 0 ; i < n; i++){
            while (st.size() > 0 && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.size() == 0) {
                res[i] = i+1;
            }
            else{
                res[i] = i - st.peek();
            }
            st.push(i);
        }
        for(int x : res){
            System.out.print(x + " ");
        }
    }
}
