package Binarysearch;

public class sortedrotatedarray {
    static int index(int arr[],int i){
    while (arr[i]>arr[i-1]) 
    {
    i++;
    }
return i;
    }
    public static void main(String[] args) {
        int arr[]={5,9,12,13,2};
        System.out.println(index(arr, 1));
    }
}//this is whole array traversal jisse time complexity badhegi to iska proper solution hah binary search wale me
