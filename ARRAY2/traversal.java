public class traversal {

    public static void raversal() {

        int arr[] = new int[6];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;

        System.out.println("First");
        // for (int i = 0; i < arr.length; i++)
         for (int i = 0; i < 6; i++){
            System.out.println(arr[i]);
        }

        // For-each loop
        System.out.println("Second");
        for (int age : arr) {
            System.out.println(age);
        }

        System.out.println("Third");
        int i = 0;
        while (i < 6) {
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        raversal();
    }
}
