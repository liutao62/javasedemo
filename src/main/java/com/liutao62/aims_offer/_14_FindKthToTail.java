package com.liutao62.aims_offer;
//输入一个链表，输出该链表中倒数第k个结点。
public class _14_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode node = new ListNode(0);
        if (head != null && k >= 0){
            int length = 1;
            node.next = head;
            while (node.next.next != null){
                node.next = node.next.next;
                length++;
            }
            length = length - k;
            if(length >= 0){
                node.next = head;
                while (length > 0){
                    node.next = node.next.next;
                    length--;
                }
                return node.next;
            }

        }
        return null;
    }
}
class ListNode{
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}