import java.util.Stack;

class nextGreaterElementOptimal {
    public static void main(String[] args) {
     Stack<Integer> st = new Stack<>();
     int arr[] = {1,3,2,1,8,6,3,4};
     int n = arr.length;
     int res [] = new int[n];

     res[n-1] = -1;
     st.push((arr[n-1]));
     for(int i = n-2 ;i >= 0 ; i--){
        while (st.size() >0 && st.peek() < arr[i]   ) {
            st.pop();
        }
        if (st.size() == 0 ) {
            res[i] = -1;
        }
        else res[i] = st.peek();
        st.push(arr[i]);
     }
     for(int y : arr){
        System.out.print(y + " ");
     }
     System.out.println();
     for(int x : res){
        System.out.print(x + " ");
     }

    }
}
