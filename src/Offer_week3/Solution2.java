package Offer_week3;/** * @author: lingjunhao * create at:  19/4/25  下午5:17 * @description: 合并两个排序的链表 */public class Solution2 {    public ListNode merge(ListNode l1, ListNode l2) {        if (l1==null)            return l2;        if (l2==null)            return l1;        ListNode node=null;        if (l1.val<=l2.val){            node=l1;            node.next=merge(l1.next,l2);        }        if (l2.val<l1.val){            node=l2;            node.next=merge(l1,l2.next);        }//        if (l1.val==l2.val){//            node=l1;//            node.next=merge(l1.next,l2);//        }        return node;    }}