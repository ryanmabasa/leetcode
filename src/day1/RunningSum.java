package day1;

import java.util.Arrays;

public class RunningSum {

    public int[] runningSum(int[] nums) {
       for(int i=1;i<nums.length;i++){
           nums[i] += nums[i-1];
       }

       return nums;

    }
}
