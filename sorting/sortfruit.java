public class sortfruit {
    static void sortfruitf(String fruit[]){
         int n = fruit.length;
         for(int i = 0 ; i < n-1 ; i++){
                int min_idx = i ;
            for(int j = i+1 ; j< n ; j++){
                if (fruit[j].compareTo(fruit[min_idx]) < 0) {
                min_idx = j;
           }
        }
        String temp = fruit[i];
          fruit[i] =  fruit[min_idx];
          fruit[min_idx] = temp;
    }
    }
    public static void main(String[] args) {
        String []fruit = {"papaya" , "lime" , "watermelon" , "apple" , "mango" , "kiwi"};
        sortfruitf(fruit);
          for(String val : fruit){
             System.out.print(val + " ");
          }
    }

}
