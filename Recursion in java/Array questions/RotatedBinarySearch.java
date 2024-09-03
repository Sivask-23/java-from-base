public class RotatedBinarySearch {
    static int rotBinarySearch(int[]ar,int l, int h, int target){
        if (l>h){
            return -1;
        }
        int mid=l+(h-l)/2;
        if (ar[mid]==target){
            return 1;
        }
//        edge case 1
        if (ar[l]<=ar[mid]){
            if (target>=ar[l] && target<=ar[mid]){
                return rotBinarySearch(ar, l, mid-1, target);
            }else {
                return rotBinarySearch(ar, mid+1, h, target);
            }
        }
//        edge case 2
        if (target >= ar[mid] && target<= ar[h]){
            return rotBinarySearch(ar, mid+1, h, target);
        }else {
            return rotBinarySearch(ar, l, mid-1, target);
        }
    }
    public static void main(String[] args) {
        int [] ar={5,6,7,8,9,1,2,3};
        System.out.println(rotBinarySearch(ar,0,ar.length-1,3));
    }
}
