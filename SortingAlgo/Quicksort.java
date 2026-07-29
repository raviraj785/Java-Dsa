class Quicksort{
    static void displayarray(int arr[]){
        for(int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
     
    static void swap(int arr[] , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int  partition(int arr[], int st , int end){
        int pivot = arr[st];
        int count = 0;
        for(int i = st+1  ; i <= end ; i++){
            if(arr[i] <= pivot) {
                count ++;
            }
        }
        int pivotidx = st+count;
        swap(arr, st, pivotidx);
            int i = st;
            int j = end;
            // element lesser --> left sideofpivotidx, Greater --> right side of pivot idx
        while (i < pivotidx && j > pivotidx) {
           while (i < pivotidx && arr[i] <= pivot) {
          i++;
           }
            while (j > pivotidx && arr[j] > pivot) {
               j--;
             }
            if (i < pivotidx && j > pivot) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotidx;

    }

    static void Quicksortt(int arr[] , int st , int end ){
        if(st >= end) return;
        int pi = partition(arr, st ,end);
        Quicksortt(arr, st , pi-1);
        Quicksortt(arr, pi+1 , end);
    }
    public static void main(String[] args) {
        int arr []= { 5,3,4,2,4,2,4,8};
        System.out.println("Original Array : ");
        displayarray(arr);
        Quicksortt(arr , 0 , arr.length-1);
        System.out.println("After Sort : ");
        displayarray(arr);

    }
}