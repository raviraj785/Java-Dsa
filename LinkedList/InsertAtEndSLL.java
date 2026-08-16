public class InsertAtEndSLL {
    public static class node{
        int data ;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public static class  linklist {
        
        node head  = null;
        node  tail = null;
        void insertatend(int val){
            node temp = new node(val);
            if (head == null) {
                head  = temp;

            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        
    
    void dispaly(){
        node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    int size(){
        node temp = head ;
        int count = 0 ;
        while (temp!=null) {
            count++;
           temp =  temp.next;
        }
        return count;
    }
}
    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.insertatend(5);
        ll.insertatend(4);
        ll.dispaly();
        System.out.println();
        System.out.println(ll.size());

    }
}
