
/**
 * Given an array of n positive integers and a positive integer s, find the
 * minimal length of a contiguous subarray of which the sum ≥ s. If there isn't
 * one, return 0 instead.
 * For example, given the array [2,3,1,2,4,3] and s = 7, the subarray [4,3] has
 * the minimal length under the problem constraint.
 *
 */
public class MinSizeSubArray {

	public static void main(String[] args) {
		int[] arr = {2,3,1,2,4,3};
		MinSizeSubArray m = new MinSizeSubArray();
		m.minSubArrayLen(7, arr);
	}
	public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        //maintain a subarray window which is [i, j ]
        int i = 0, j = 0; 
        int sum = 0; // keep track of the sum of subarray window [i, j]
        for(j = 0; j < nums.length;j ++) {
        	sum += nums[j];
        	if(sum <s) {
        		continue;
        	}
        	while(sum >= s) {
        		res = Math.min(res, j-i+1);
        		//i++;
        		sum = sum - nums[i];
        		i++; // this must come after sum abstraction
        	}
        }
        return res == Integer.MAX_VALUE? 0: res;
    }
	
}
