package Binarysearch;

public class kidinracetrack {
    static boolean isdivision(int arr[],int kid,int dist){

        int lastkid=arr[0];
        int kidplaced=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-lastkid>=dist){
             kidplaced++;
             lastkid=arr[i];
            }
        }
        if (kidplaced>=kid) {
            return true;
        }
        else
        {
            return false;
        }

    }
    static int kidstatus(int arr[],int kid){
        int i=0;
        int j=10000;
        int ans=0;
        while(i<=j){
            int mid=(i+j)/2;
            if (isdivision(arr, kid, mid)) 
            {
                ans=mid;
                i=mid+1;
            }
            else
            j=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,8,9};
        System.out.println(kidstatus(arr, 3));
    }
}
