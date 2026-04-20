https://leetcode.com/problems/concatenation-of-array/
Given an integer array nums of length n, you want to create an array ans of length 2n 
  where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
  
  public class Concat{
    static int[] getConcat(int[] nums){
      int n = nums.length;
      int n1 = nums.length;
      int ans[] = new int[n + n1];
      System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n1, n1);
        System.out.println(Arrays.toString(ans));

         return ans; 
      // How it works:
      The Method Signature
      System.arraycopy(source, srcPos, destination, destPos, length);
      source: The array you are copying from.
      srcPos: Where to start reading in the source array.
      destination: The array you are copying into.
      destPos: Where to start writing in the destination array.
      length: How many elements to copy.
    }
}


https://leetcode.com/problems/running-sum-of-1d-array/
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

public class Running{
  public static void main(String[] args){
    int[] nums1 = {2,3,4,5};
    runningSum(nums1);
  }
  public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int curr = 0;
        for(int i=0;i<n;i++){
            curr += nums[i];
            ans[i]=curr;
        }
        return ans;
    }
}
