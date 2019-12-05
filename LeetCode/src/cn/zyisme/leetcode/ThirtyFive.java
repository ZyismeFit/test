package cn.zyisme.leetcode;
/*
给定一个排序数组和一个目标值，
在数组中找到目标值，并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
你可以假设数组中无重复元素。
示例 1:
输入: [1,3,5,6], 5
输出: 2
示例 2:
输入: [1,3,5,6], 2
输出: 1
 */
public class ThirtyFive {
    public static void main(String[] args) {
        int []arr = {1,3,5,6} ;
        int len1 = searchInsert(arr,7);
        System.out.println("len1 = " + len1 + "----------------");
    }
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return 0;
        int right = nums.length;
        int left = 0;
        int mid = (right + left)/2;
        while (left < right){
            if(target < nums[mid]){
                right = mid;
                mid = (right + left)/2;
            }
            else if(target == nums[mid])
            return  mid;
            else {
                left = mid+1;
                mid = (right + left)/2;
            }

        }
        return mid;

    }
}
