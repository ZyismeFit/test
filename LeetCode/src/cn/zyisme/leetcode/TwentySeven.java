package cn.zyisme.leetcode;
/*
给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，
返回移除后数组的新长度。
示例 2:
给定 nums = [0,1,2,2,3,0,4,2], val = 2,
函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
注意这五个元素可为任意顺序。
你不需要考虑数组中超出新长度后面的元素。
 */
public class TwentySeven {
    public static void main(String[] args) {
        int [] nums1 = new int[]{0,1,2,2,3,0,4,2};
        int len1 = removeElement(nums1,2);
        printArray(nums1,len1);
        System.out.println("len1 = " + len1 + "----------------");
    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int i = 0;
        //{0,1,2,2,3,0,4,2};
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

        //直接使用最后一个元素替换当前与val值相同的元素，丢弃最后一个值，因为元素顺序是可以交换的
     /*
        int len = nums.length;
        int i = 0;
        while(i<len){
            if(nums[i] == val){
                nums[i] = nums[len-1];
                len--;
            }
            else
                i++;
        }
        return i;
*/
    }
    public  static void printArray(int []arr,int len){
        for (int i = 0; i < len; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
