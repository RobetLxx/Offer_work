package Offer_week1;/** * @author: lingjunhao * create at:  19/4/14  下午1:26 * @description: */public class Solution1 {    public int duplicateInArray(int nums[]){        int size=nums.length;        for (int x:             nums) {            if (x<0||x>=size)                return -1;        }        for (int i = 0; i < size; i++) {            while (i!=nums[i]&&nums[nums[i]]!=nums[i]){                int temp=nums[nums[i]];                nums[nums[i]]=nums[i];                nums[i]=temp;            }            if (nums[i]!=i&&nums[nums[i]]==nums[i])return nums[i];        }        return -1;    }}