package Offer_week1;/** * @author: lingjunhao * create at:  19/4/18  下午8:18 * @description: 二维数组查找 */public class Solution3 {    public static boolean findNum(int[][] array,int target){        boolean found=false;        if (array!=null&&array.length>0){            int row=0;            int col=array[0].length-1;            while (col>=0&&row<array.length){                int diff=array[row][col]-target;                // System.out.println(array[row][col]);                if (diff==0){                    found=true;                    break;                }else if (diff>0){                    //System.out.println(col);                    col--;                }else {                    row++;                }            }        }        return found;    }    public static void main(String[] args) {        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};        System.out.println(findNum(arr, 9));    }}