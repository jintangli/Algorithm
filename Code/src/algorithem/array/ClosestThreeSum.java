package algorithem.array;

import java.util.Arrays;

/**
 * Created by Jin on 2/5/2019.
 */
public class ClosestThreeSum {

    public static void main(String[] args){
        int[] array = new int[]{-1,2,1,-4};
        int target = 1;
        System.out.print("solution is :" + closestThreeSum(array, target));
    }

    public static int closestThreeSum(int[] nums, int target){
        Arrays.sort(nums);
        int next, len = nums.length, last = len - 1;
        int sum, result = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < len - 2; ++i){
            next = i + 1;
            while(next < last){
                sum = nums[i] + nums[next] + nums[last];
                if(sum > target){
                    --last;
                }else{
                    ++next;
                }
                result = Math.abs(sum - target) < Math.abs(result - target)? sum : result;
            }
        }
        return result;
    }

}
