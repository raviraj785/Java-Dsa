public class GetIndexSLL {
    
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
        void insertatstart(int val){
            node temp = new node(val);
            if (head == null) {
                head  = tail=temp;

            }
            else{
                temp.next = head;
            }
            head = temp;
        }
        
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
        void insertat(int idx , int val){
            node t = new node(val);
            node temp = head;
            if (idx == size()) {
                insertatend(val);
                return;
            }
            else if (idx == 0) {
                insertatstart(val);
                return;
            }
            else if (idx < 0 || idx > size()) {
                System.out.println("Wrong Input ");
                return;
            }
            for(int i = 0 ; i < idx-1; i++){
                temp = temp.next ;
            }
            t.next = temp.next;
            temp.next = t ;
        }
        int getindex(int idx){
           node temp = head;
           for(int i = 0 ;i < idx ; i++){
             temp=  temp.next;

           }
           return temp.data;
        }
        void delete (int idx){
            if (idx == 0) {
               head= head.next;
               return;
            }
             node  temp = head;
             for(int i = 0 ; i < idx; i++){
                temp = temp.next;
             }
               temp.next = temp.next.next;
               tail = temp;

        }
        void dispaly(){
        node temp = head;
        
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
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
        ll.insertatstart(5);
        ll.insertatstart(4);
        ll.insertatstart(40);
        ll.dispaly();
        ll.insertat(2, 3);
        ll.dispaly();
        System.out.println(ll.getindex(3));
        ll.delete(0);
        ll.dispaly();


    }
    
}


