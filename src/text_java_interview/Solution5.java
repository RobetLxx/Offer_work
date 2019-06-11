package text_java_interview;

import java.util.Scanner;

/**
 * @author: lingjunhao
 * create at:  2019-05-18  10:45
 * @description:
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int key=scanner.nextInt();
        while (key-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int mid=n/2;
            if (mid<=1){
                System.out.println("0 0");
            }else {
                if (k < mid) {
                    System.out.println("0 " + (k - 1));
                } else {
                    System.out.println("0 " + (n - k));
                }
            }
        }
    }
}
