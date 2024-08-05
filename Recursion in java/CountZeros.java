public class CountZeros {
    static int countZero(int value,int count){
        if (value==0){
            return count;
        }
        if ((value%10==0)){
            return countZero(value/10,count+1);
        }
        else{
            return countZero(value/10,count);
        }
    }
    public static void main(String[] args) {
        int num=10011;
        System.out.println("Number of zeros are "+countZero(num,0));
    }
}
