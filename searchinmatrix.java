package Binarysearch;

import java.util.Scanner;

public class searchinmatrix {
    static boolean search(int arr[][],int target){
        int n=arr.length;
        int m=arr[0].length;
        int i=0;int j=m-1;
        while (i<n&&j>=0) {
            if (target==arr[i][j]) {
             return true;
            }
            if (target>arr[i][j] ){
                i++;//move down
            }
            else
            j--;//move left
        }
        return false;
    }//this method can be used in searchin2d array problem also.
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


