package cn.zyisme.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那
两个整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
*/
public class One {
    public static void main(String[] args) {
        int arr[]={3,2,4};
        int ret[] = new int[2];
        Solution1 s1 = new Solution1();
        ret = s1.twoSum(arr,6);
        System.out.println(ret[0]);
        System.out.println(ret[1]);
        System.out.println("--------------");
        Solution2 s2 = new Solution2();
        ret = s2.twoSum(arr,6);
        System.out.println(ret[0]);
        System.out.println(ret[1]);
    }
}
class Solution2{
    //使用HashMap存储 另一个加数与对应的数组下标
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            m.put(temp,i);
        }
        //进行遍历 如果包含key 且其对应的下标不相同 即防止目标是8 键是4 的问题
        for (int i = 0; i < nums.length; i++) {
           if(m.containsKey(nums[i]) && m.get(nums[i]) != i){
               int arr[] = new int[2];
               arr[0] = i;
               arr[1] = m.get(nums[i]);
               return arr;
           }
        }
        return new int[2];
        //把创建HashMap和查询放在一块
       /* Map<Integer,Integer> dic = new HashMap<Integer,Integer>(nums.length);
        for(int i = 0; i < nums.length; i++){
            int elem = target - nums[i];
            if(dic.containsKey(elem)){
                return new int[]{dic.get(elem),i};
            }
            dic.put(nums[i], i);
        }
        return null;*/
    }

}

//最慢的 双循环
 class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int [] arr = new int[2];
        int temp ;
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == temp) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}