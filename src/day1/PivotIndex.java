package day1;

public class PivotIndex {

    public static int pivotIndexBruteForce(int[] nums) {

        for(int i=0;i< nums.length;i++){

            int leftsum = 0;
            int rightsum =0;

            for(int j=0;j<i;j++){
                leftsum+=nums[j];
            }

            for(int j=i+1;j<nums.length;j++){
                rightsum+=nums[j];
            }

            if(leftsum==rightsum){
                return i;
            }

        }

        return -1;
    }

    public static int pivotIndex(int[] nums){

        int total = 0;
        int leftsum = 0;

        for(int i=0;i< nums.length;i++){
            total +=nums[i];
        }

        for(int i=0;i< nums.length;i++){
            total-=nums[i];

            if(total == leftsum)
                return i;

            leftsum+=nums[i];
        }

        return -1;

    }
}
