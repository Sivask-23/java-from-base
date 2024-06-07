public class sortRotateAndFind {
    public static int binarySearch(int[] ar, int l, int h, int key){

        if (l>h){
            return -1;
        }
        int mid=(l+h)/2;
        if (ar[mid]==key){
            return mid;
        }
        if (ar[l]<ar[mid]){
            if (key>=ar[l] && key<=ar[mid]){
                return binarySearch(ar,l,mid-1,key);
            }
            else return binarySearch(ar,mid+1,h,key);
        }

        if (key>=ar[mid] && key<=ar[h]){
            return binarySearch(ar,mid+1,h,key);
        }
        else {
            return binarySearch(ar,l,mid-1,key);
        }

    }
    public static void main(String[] args) {
        int[] ar={5,6,7,8,9,10,1,2,3};
        int key=11;
        int n=ar.length;
        int idx=binarySearch(ar,0,n-1,key);
        if (idx==-1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at:"+idx);
        }
    }
}
