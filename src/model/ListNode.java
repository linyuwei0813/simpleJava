package model;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode currentNode = new ListNode(arr[i]);
            tail.next = currentNode;
            tail = currentNode;
        }
        return head;
    }

    public static ListNode createCycledLinkedList(int[] arr, int pos){
        if (arr == null || arr.length == 0) {
            return null;
        }
        if(pos>=arr.length){
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode entrance = head;
        ListNode tail = head;
        for(int i=1;i<arr.length;i++){
            ListNode currentNode = new ListNode(arr[i]);
            tail.next = currentNode;
            tail = currentNode;
            if(i<=pos){
                entrance = currentNode;
            }
        }
        if(pos != -1){
            tail.next = entrance;
        }
        return head;
    }

    public static boolean isEqual(ListNode list1, ListNode list2){

        while (list1!=null && list2 !=null){
            if(list1.val!=list2.val){
                return false;
            }else {
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        if(list1 == null ^ list2 == null){
            return false;
        }
        return true;
    }
}
