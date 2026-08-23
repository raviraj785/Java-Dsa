public class LinkedListImplementationofStack {
    public static class Node {
        int val ;
        Node  next;
        Node(int val){
           this.val= val ;
        }
    }
        public static class LLStack{
           private Node head = null ;
           private int size = 0 ;
            void push(int x ){
                Node temp = new Node(x);
                temp.next = head;
                head = temp;
                size++;
            }
             int pop(){
                if (head == null) {

                    System.out.println("Stack Is Empty");
                    return -1;
                }
                int x = head.val;
                head  = head.next;
                size --;
                return x;

            }
             int peek(){
                if (head == null) {
                    System.out.println("Stack IS empty");
                    return -1 ;
                   
                }
                 return head.val;
             }
            void display(){
              Node temp = head;
              while (temp != null) {
                System.out.print(temp.val +  " ");
                temp = temp.next;
              }
              System.out.println();

            }
           
            int size(){
                return size;
            }
            boolean isEmpty(){
                if (size == 0) {
                   return true; 
                }
                else {
                    return false;
                }
            }
            
        }

    
    public static void main(String[] args) {
         LLStack st = new LLStack();
         st.push(4);
         st.display();
          st.push(5);
         st.display();
         st.push(1);
         st.display();
         System.out.println(st.size());
         st.pop();
         st.display();
         System.out.println(st.size());
         st.push(7);
         st.push(8);
    }
}
