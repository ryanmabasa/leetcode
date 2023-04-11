package day4;

import day3.ListNode;

public class MiddleOfLinkedList {
    public static ListNode middleNode(ListNode head) {
        int index =0;
        ListNode current = head;
        while (current!=null){
            current = current.next;
            index++;
        }

        int mid = (int) Math.ceil(index/2);

        ListNode otherHalf = head;

        for(int i=0;i<mid;i++){
            otherHalf=otherHalf.next;
        }

        return otherHalf;

    }
}
