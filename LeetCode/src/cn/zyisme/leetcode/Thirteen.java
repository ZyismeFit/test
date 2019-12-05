package cn.zyisme.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做 II ，即为两个并列的 1。
12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，
例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，
数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
	I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
	X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
	C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
示例 1:
输入: "III"
输出: 3
示例 2:
输入: "IV"
输出: 4
示例 3:
输入: "IX"
输出: 9
示例 4:
输入: "LVIII"
输出: 58
解释: L = 50, V= 5, III = 3.
示例 5:
输入: "MCMXCIV"
输出: 1994
解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class Thirteen {
    public static void main(String[] args) {
        String s = "IX";
        int ret = romanToInt(s);
        System.out.println("Roman:" + s +" Integer:" + ret);
    }
    public static   int romanToInt(String s) {
        //Map 集合的key value不能是基本类型
        Map<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int ret = 0;
        int j = -1;
        for (int i = 0; i < s.length()-1; i++) {
            //如果左边比右边的数字小减法
            int temp = m.get(s.charAt(i));
            if(m.get(s.charAt(i)) < m.get(s.charAt(i+1))) {
                ret -= temp;
            }
            //如果大于等于直接加
            else {
                ret += temp;
            }
        }
        //处理最后一个数字 直接加
        ret += m.get(s.charAt(s.length()-1));
        return ret;
    }
    /*//把hashmap换成switch效率可以提升很多
    public static int getNum(char c){
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }*/


}

