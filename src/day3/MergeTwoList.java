package day3;

public class MergeTwoList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode list = new ListNode(0);

        ListNode head = list;

        while (list1!=null && list2!=null){

            if(list1.val<=list2.val){
                list.next=list1;
                list1 = list1.next;
            }
            else {
                list.next=list2;
                list2 = list2.next;
            }
            list = list.next;

        }

        while (list1!=null){

            list.next = list1;
            list1 = list1.next;
            list = list.next;

        }

        while (list2!=null){

            list.next = list2;
            list2 = list2.next;
            list = list.next;

        }

        return head.next;

    }
}
