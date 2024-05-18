package Binarysearch;

public class firstsquareroot {
    static int sqrt(int target){

        int i=0,j=target;
        int ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            int val=mid*mid;
if (target==val) {
    return mid;
}
else if (target<val) {
    j=mid-1;
}
else
i=mid+1;
ans=mid;


        }
        return ans;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sqrt(n));
    }
}
    