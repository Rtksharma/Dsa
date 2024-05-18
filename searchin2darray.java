package Binarysearch;

import java.util.Scanner;
public class searchin2darray {
    static boolean search(int arr[][],int target){

       int n=arr.length;
       int m=arr[0].length;
        int i=0;
        int j=n*m-1;
        while (i<=j) {
            int mid=(i+j)/2;
            int midelement=arr[mid/m][mid%m];
            if (target==midelement) {
                return true;
            }
            if (midelement>target) {
               j=mid-1; 
            }
            
            else
              i=mid+1;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of the row"); 
       int r=sc.nextInt();
       System.out.println("enter the value of the column");
       int c=sc.nextInt();
       System.out.println("enter the value of the target");
       int t=sc.nextInt();
       int[][] array=new int[r][c];
       System.out.println("enter the value of the array");
    for (int i = 0; i < array.length; i++) 
    {
        for (int j = 0; j < array[i].length; j++) 
        {
            array[i][j]=sc.nextInt();
        } 
    }
    System.out.println("the value of the array is");
    for (int k = 0; k < array.length; k++)
   {
        for (int l = 0; l < array[k].length; l++)
        {
               System.out.print(array[k][l]+" ");
        }
        System.out.println("  ");
    }
   System.out.println(search(array, t)); 

    }
}
