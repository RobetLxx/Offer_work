package T_0x00;

import java.util.Scanner;

/**
 * @author: lingjunhao
 * create at:  2019-05-18  10:38
 * @description:
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int key=0;
        if (x<=5) System.out.println(1);
        else {
            while (x>0){
                key++;
                x-=5;
            }
            System.out.println(key);
        }
    }
}
