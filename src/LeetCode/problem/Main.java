package LeetCode.problem;import java.util.*;public class Main {    public static void main(String[] args) {            int num;            Scanner scanner=new Scanner(System.in);            num=Integer.parseInt(scanner.nextLine());            if(num<4||(num-1)%3!=0)            {                return;            }            char[] p=new char[num];            String str=scanner.nextLine();            p=str.toCharArray();            int size_p=2*((num-1)/3)+1;            int key=0;            for (int i=0;i<size_p/2;i++){                for (int j=0;j<size_p;j++){                    if (i==j||(size_p-1-j)==i){                        System.out.print(p[key]);                        key++;                    }else {                        System.out.print(" ");                    }                }                System.out.println();            }            for (int i=size_p/2;i<size_p;i++){                for (int j=0;j<=size_p/2;j++){                    if (j==(size_p/2)){                        System.out.print(p[key]);                        key++;                    }else {                        System.out.print(" ");                    }                }                if (i!=size_p-1) {                    System.out.println();                }            }    }}