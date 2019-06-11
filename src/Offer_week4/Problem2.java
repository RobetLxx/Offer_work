package Offer_week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: lingjunhao
 * create at:  2019-05-10  11:12
 * @description:
 */
public class Problem2 {
    public List<Integer> getLeastNumbers_Solution(int [] input, int k) {
        List<Integer> list=new ArrayList<>();
        if(input.length==0)return list;
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
    public int maxSubArray(int[] nums) {
        if (nums==null)return 0;
        int size=nums.length;
        int sum=nums[0];
        int max=nums[0];
        for (int i = 0; i < size; i++) {
            sum=nums[i]+sum;
            if (sum<nums[i]){
                sum=nums[i];
            }if (max<sum){
                max=sum;
            }
            System.out.println(max);
        }
        return max;
    }
}
