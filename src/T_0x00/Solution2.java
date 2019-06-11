package T_0x00;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: lingjunhao
 * create at:  2019-05-18  10:34
 * @description:
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []x=new int[3];
        for (int i = 0; i < 3; i++) {
            x[i]=sc.nextInt();
        }
        Arrays.sort(x);
        System.out.println(x[2]-x[0]);
    }
}
