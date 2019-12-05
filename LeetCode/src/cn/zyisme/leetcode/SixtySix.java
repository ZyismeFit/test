package cn.zyisme.leetcode;
/*
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。
输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。
输入: [9,9]
输出: [1,0,0]
解释: 输入数组表示数字 123。
//两种情况最后一位是9的与不是9的
不是9 加一直接返回
是9加一进位处理上一位 如此循环
 */
public class SixtySix {
    public static void main(String[] args) {
        int []arr = {2,9,3,9};
        int []ret = plusOne(arr);
        printArray(ret,ret.length);
    }
    public static int [] plusOne(int[] digits) {
        int n = digits.length - 1;
        while (n >= 0){
            //最后一位直接加1
            digits[n]++;
            digits[n] = digits[n] % 10;
            //如果最后一位模10!=0则说明原来最后一位不是9 直接返回
            if(digits[n] != 0)
                return digits;
            n--;
         }
        //如果在while循环结束还没返回，则说明是类似于[9,9,9]这样的数组，
        //所以需要在原来数组上扩充一位，第一位赋值为1
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public  static void printArray(int []arr,int len){
        for (int i = 0; i < len; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}
