package Offer_week2;/** * @author: lingjunhao * create at:  19/4/25  下午4:55 * @description:链表环的入口结点 */public class Solution11 {    public ListNode entryNodeOfLoop(ListNode head) {        ListNode meet=meetNode(head);        if (meet==null)return null;//证明没有环        int num=1;        ListNode node=meet.next;        //环内有几个结点        while (node!=meet){            num++;            node=node.next;        }        //让指针指向环中的一个结点        node=head;        for (int i = 0; i < num; i++) {            node=node.next;        }        //在两个结点相遇的位置就是入口结点        ListNode node1=head;        while (node!=node1){            node=node.next;            node1=node1.next;        }        return node1;    }    //快慢指针，返回的是环内的点    public static ListNode meetNode(ListNode head){        if (head==null)return null;        ListNode first=head;        ListNode second=head.next;        while (first!=null&&second!=null){            if (first==second){                return second;            }            first=first.next;            second=second.next;            if (second!=null)                second=second.next;        }        return null;    }}