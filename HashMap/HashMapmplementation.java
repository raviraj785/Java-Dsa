public class HashMapmplementation {
    static class MyHashMap<K,V>{
      public  static final int DEFAULT_CAPACITY =4;
       public  static final float DEFAULT_LOAD_FACTOR =0.75F;
        private  class Node {
           K key ;
           V value;

           Node(K key , V value){
            this.key = key;
            this.value = value;
           }
            
        }
        
        public  int size(){

        }
        public void  put(K key, V valueV){
            
        }
        public  V get(K key){

        }
        public V remove(V value){
            
        }

    }
    public static void main(String[] args) {
        MyHashMap<String , Integer> mp = new MyHashMap<>();
}
}
