package day8;

public class BinarySearch {
    public static int search(int[] nums, int target) {

        return binaryIterative(0,nums.length-1,nums,target);
    }

    private static int binarySearch(int start, int end,int[] nums,int target){

        if(start<=end){

            int mid = (start+end)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                return binarySearch(start,mid-1,nums,target);
            }

            return binarySearch(mid+1,end,nums,target);


        }
        return -1;
    }


    public static int binaryIterative(int start, int end,int[] nums,int target){

        while(start<=end){

            int mid = (start+end)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else {
                start= mid+1;
            }

        }
        return -1;
    }
}
