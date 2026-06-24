package suva;
public class ReverseLinkedList {

    // Node definition
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    // Helper — builds a linked list from an array
    static ListNode build(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Helper — prints the linked list
    static void print(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" → ");
            curr = curr.next;
        }
        System.out.println();
    }

    // YOUR SOLUTION GOES HERE
    static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null, next = null; 
        // your code
        while(curr != null) {
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;

        } 
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = build(new int[]{1, 2, 3, 4, 5});
        print(head);                    // 1 → 2 → 3 → 4 → 5
        ListNode reversed = reverse(head);
        print(reversed);               // 5 → 4 → 3 → 2 → 1
    }
}