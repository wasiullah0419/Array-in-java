import java.util.*;
class ArrayOutputUsingLoop {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your array length");
         int n=sc.nextInt();
         int []arr= new int[n];
         System.out.println("Enter your array element");
         for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Array elements using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
    }
}