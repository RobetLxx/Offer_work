package LeetCode.problem;/** * @author: lingjunhao * create at:  19/4/10  下午7:40 * @description: 回文数判断 */public class Palindrome_Number {    public boolean isPalindrome(int x) {        String str=String.valueOf(x);        char fstr=str.charAt(0);        String newstr="";        if (fstr=='-'){            return false;        }else {            for (int i =str.length()-1; i>=0; i--) {                newstr+=str.charAt(i);            }            if (newstr.equals(str)){                return true;            }else {                return false;            }        }    }}