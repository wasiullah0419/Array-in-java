 
 // write a code in java to print negative elements of array element
 import java.util.Scanner;
 class NegativeArrayElementPrint {
    public static void  main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enater your array length");
          int n=sc.nextInt();
          int []arr= new int [n];
           System.out.println("Enater your array element");
          for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("print only negative element");
        for(int i=0;i<n;i++){
             if (arr[i]<0) 
                System.out.println(arr[i]);
        }
       
    }
}
