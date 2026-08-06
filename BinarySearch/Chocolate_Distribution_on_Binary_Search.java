/*Chocolate Distribution Problem

Problem Statement

You are given an array of integers where each element represents the number of chocolates in a box. You have to distribute these boxes among M students such that the maximum number of chocolates assigned to any student is minimized.

Rules:
1. Each box must be assigned to exactly one student.
2. Every box must be assigned.
3. Each student must receive at least one box.
4. The boxes assigned to a student must be contiguous (consecutive).

Return the minimum possible value of the maximum chocolates assigned to any student.

Example:

Input:
Boxes = [12, 34, 67, 90]
Students = 2

Output:
113

Explanation:
The optimal distribution is:
Student 1 -> [12, 34, 67] = 113
Student 2 -> [90] = 90

The maximum chocolates assigned to any student is 113, which is the minimum possible answer. */
 
/**
 * Chocolate_Distribution_on_Binary_Search
 */
public class Chocolate_Distribution_on_Binary_Search {


       static boolean isdivisionpossible(int arr [] , int m , int  mxchoclate){
        int noofstudent = 1;
        int choc = 0 ; // no of choclate has first student 
        for(int i = 0 ; i < arr.length ; i ++){
        if (arr[i] > mxchoclate) {
            return false;
        }
       if (choc + arr[i] <= mxchoclate) {
        choc+=arr[i];
       }
       else{
        noofstudent++;
        choc = arr[i];
       }

       }
       return noofstudent <= m;
    }


    static int distributechocolate(int arr[] , int m ){
        if (arr.length < m) {
            return -1 ;
        }
        int ans = 0 ;
        int st = 1;
        int end = (int) 1e9;
        while (st <= end) {
             int mid = st + (end - st) /2;
             if (isdivisionpossible(arr, m , mid)) {
                ans = mid ;
                 end = mid - 1;
                
             }
             else{
                st = mid +1;
             }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr [] = {5,1,3,4,2};
        int m = 3;
        System.out.println(distributechocolate(arr, m));
    }
}