package pattern;

public class rightangle {
    public static void main(String[] args) {
       /*
       *
       **
       ***
       ****
        */
        // for(int i=1;i<=4;i++){
        //     for(int j= 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /* 
1
12
123
1234
         */
        //   for(int i=1;i<=4;i++){
        //     for(int j= 1;j<=i;j++){
        //         // System.out.print(j);
        //          System.out.print(i);
        //     }

        //     System.out.println();
        /*
A
AB
ABC
ABCD
        */
       for(int i=1;i<=11;i++){
            for(int j= 1;j<=i;j++){
                // System.out.print((char)(j+64));
               if(i%2!=0){
                System.out.print(j+"");
               }
               else
                 System.out.print((char)(j+64)+"");  
        }
         System.out.println();
    }
    

/*
A
BB
CCC
DDDD */
    //        for(int i=1;i<=4;i++){
    //         for(int j= 1;j<=i;j++){
    //             // System.out.print((char)(j+64));
    //              System.out.print((char)(i+64));  
    //     }
    //      System.out.println();
    // }
    
    }
}
