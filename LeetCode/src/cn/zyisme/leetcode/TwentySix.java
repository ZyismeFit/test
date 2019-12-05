package cn.zyisme.leetcode;
/*
给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，
返回移除后数组的新长度。
不要使用额外的数组空间，你必须在原地修改输入数组并在使用
O(1) 额外空间的条件下完成。
示例 1:
给定数组 nums = [1,1,2],
函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
你不需要考虑数组中超出新长度后面的元素。

示例 2:
给定 nums = [0,0,1,1,1,2,2,3,3,4],
函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
你不需要考虑数组中超出新长度后面的元素。

 */
public class TwentySix {
    public static void main(String[] args) {
        int nums1 [] = new int[]{1,1,2};
        int nums2 [] = new int[]{0,0,1,1,1,2,2,3,3,4};
        int len1 = removeDuplicates(nums1);
        printArray(nums1,len1);
        System.out.println("len1 = " + len1 + "----------------");
        int len2 = removeDuplicates(nums2);
        printArray(nums2,len2);
        System.out.println("len1 = " + len2 + "----------------");
    }
    /*双指针法 i ,j
        如果nums[i] == nums[j]
        则j+1 到nums[i] != nums[j]
        则复制nums[j]到nums[i+1];
        递增i，直到j到末尾
        */
    public static int removeDuplicates(int[] nums) {
       if(nums.length == 0)
           return 0;
       int i = 0;
        for (int j = i+1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public  static void printArray(int []arr,int len){
        for (int i = 0; i < len; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
