public class ImplementStackarray {

    public static class Stack {

        private int[] arr = new int[5];
        private int idx = 0;

        // Push
        void push(int x) {

            if (isFull()) {
                System.out.println("Stack is Full");
                return;
            }

            arr[idx] = x;
            idx++;
        }

        // Peek
        int peek() {

            if (idx == 0) {
                System.out.println("Stack is Empty!");
                return -1;
            }

            return arr[idx - 1];
        }

        // Pop
        int pop() {

            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int top = arr[idx - 1];

            idx--;

            return top;
        }

        // Display
        void display() {

            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }

        // Size
        int size() {
            return idx;
        }

        // Is Empty
        boolean isEmpty() {
            return idx == 0;
        }

        // Is Full
        boolean isFull() {
            return idx == arr.length;
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(4);
        st.display();

        st.push(5);
        st.display();

        st.push(1);
        st.display();

        System.out.println("Size: " + st.size());

        st.pop();
        st.display();

        System.out.println("Size: " + st.size());

        st.push(7);
        st.push(8);

        st.display();

        System.out.println("Top: " + st.peek());
    }
}