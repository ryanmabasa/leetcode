package day3;

import day2.Subsequence;

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode4;

        ListNode listNode11 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode44 = new ListNode(4);
        listNode11.next = listNode3;
        listNode3.next = listNode44;


        System.out.println(MergeTwoList.mergeTwoLists(listNode1, listNode11));


        System.out.println(ReverseLinkedList.reverseList(listNode1));

    }
}