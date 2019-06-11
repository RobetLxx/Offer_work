package Offer_week5;

import LeetCode.problem.Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: lingjunhao
 * create at:  2019-06-11  15:35
 * @description:
 */
public class Solution1 {
    public int numberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i,b = n % i;
            count += (a + 8) / 10 * i + ((a % 10 == 1) ? b + 1 : 0);
        }
        return count;

    }
    public void test(){
        Stack<Double> stk=new Stack<>();
        Stack<List<Double>> list=new Stack<>();
        stk.push(1d);
        list.push(getStack(stk));
        stk.push(2d);
        list.push(getStack(stk));
        System.out.println(list.toString());
    }

    public List<Double> getStack(Stack<Double> stk) {
        List<Double> getStk = new ArrayList<>();
        for (Double x : stk) {
            getStk.add(x);
        }
        return getStk;
    }


    public static void main(String[] args) {
        Double x=1.0d;
        Integer y=Integer.parseInt(String.valueOf(x));
        System.out.println(y);
    }
}
