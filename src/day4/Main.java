package day4;

import day3.ListNode;
import day3.MergeTwoList;
import day3.ReverseLinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5= new ListNode(5);
        ListNode listNode6= new ListNode(6);

        listNode1.next= listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=listNode6;




        System.out.println(MiddleOfLinkedList.middleNode( listNode1));

    }
}