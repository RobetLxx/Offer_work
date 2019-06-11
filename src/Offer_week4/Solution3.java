package Offer_week4;

/**
 * @author: lingjunhao
 * create at:  2019-05-10  19:11
 * @description: 复杂链表的复刻
 */
class ListNode{
    int val;
    ListNode next,random;
    ListNode(int x){val=x;}

}

public class Solution3 {
    public ListNode copyRandomList(ListNode head){
        //处理next
        if (head==null)return null;
        ListNode node1=head;
        while (node1!=null){
            ListNode node2=new ListNode(node1.val);
            node2.next=node1.next;
            node1.next=node2;
            node1=node1.next.next;
        }

        //处理random
        ListNode ran1=head;
        while (ran1!=null){
            ListNode ran2=ran1.next;
            if (ran1.random!=null){
                ran2.random=ran1.random.next;
            }
            ran1=ran2.next;
        }

        //复制出来
        ListNode node=head;
        ListNode cloneNode=null;
        ListNode cloneHead=null;
        //先把头结点弄出来
        if (node!=null){
            cloneHead=node.next;
            cloneNode=cloneHead;
            node.next=cloneNode.next;
            node=cloneNode.next;
        }
        //再复制后面的
        while (node!=null){
            cloneNode.next=node.next;
            cloneNode=cloneNode.next;
            node.next=cloneNode.next;//把之前的后继节点删掉
            node=cloneNode.next;
        }
        return cloneHead;
    }
}
