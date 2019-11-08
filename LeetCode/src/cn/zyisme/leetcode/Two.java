package cn.zyisme.leetcode;

import static java.lang.Math.abs;

/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
示例 1:
输入: 123
输出: 321
示例 2:
输入: -123
输出: -321
示例 3:
输入: 120
输出: 21
假设只能存32位有符号整数
请根据这个假设，如果反转后整数溢出那么就返回 0
 */
public class Two {
    public static void main(String[] args) {
        Solution s = new Solution();
        int x = -2147483641;
        System.out.println(s.reverse(x));
    }
}
class Solution {
    public int reverse(int x) {
        long a =0;
        while(x != 0 ){
            //取x的个位数
            a += x%10;
            //x/10
            x /= 10;
            //a*10
            a *= 10;
        }
        a /= 10;
        if(a > 2147483647 || a < -2147483648){
            return 0;
        }
        return (int)a;
    }
}
