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
}
