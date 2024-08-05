public class BinarySearchUsimgRecursion {
    static int BinarySearch(int[] ar,int l, int h, int target){
        if (l>h){
            return -1;
        }
        int mid=l+(h-l)/2;
        if (ar[mid]==target){
            return 1; // found
        }
        if (target<ar[mid]){
            return BinarySearch(ar,l,mid-1,target);
        }else {
            return BinarySearch(ar,mid+1,h,target);
        }
    }
    public static void main(String[] args) {

        int [] nums={1,2,3,44,55,66,78};
        int n=nums.length;
        int ans=BinarySearch(nums,0,n,45);
        System.out.println((ans==1)?"found":"not found");

    }
}
