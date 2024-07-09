import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> findTriplets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // we need to sort array first
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int front = i + 1;
            int rear = nums.length - 1;
            while (front < rear) {
                int sum = nums[i] + nums[front] + nums[rear];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[front], nums[rear]));

                    while (front < rear && nums[front] == nums[front + 1]) {
                        front++;
                    }
                    while (front < rear && nums[rear] == nums[rear - 1]) {
                        rear--;
                    }
                    front++;
                    rear--;
                } else if (sum < 0) {
                    front++;
                } else {
                    rear--;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {30, -40, -20, -10, 40, 0, 10, 5};
        List<List<Integer>> l1=findTriplets(nums);
        System.out.println(l1);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
            for (int j = 0; j < l1.get(i).size(); j++) {
                System.out.println(l1.get(i).get(j));
            }
            System.out.println();
        }

    }
}
