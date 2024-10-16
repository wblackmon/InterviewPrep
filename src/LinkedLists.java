import java.util.List;

public class LinkedLists {
    public ListNode middleNode(ListNode head) {
        int length = getLinkedListLength(head, 0);
        ListNode result;

        if (length % 2 == 0) {
            int count = 0;
            for (int i = 0; i < length / 2; i++) {
                while (head.next != null) {
                    result = head.next;
                }
            }
        }

        return null;
    }

    void addNode(ListNode prevNode, ListNode nodeToAdd) {
        nodeToAdd.next = prevNode.next;
        prevNode.next = nodeToAdd;
    }

    void deleteNode(ListNode prevNode) {
        prevNode.next = prevNode.next.next;
    }

    static int getLinkedListLength(ListNode head, int length) {
        if (head == null) {
            return length;
        }
        length++;
        return getLinkedListLength(head.next, length);
    }

    public static ListNode buildLinkedList(int length) {
        ListNode head = new ListNode(1);
        ListNode currNode = head;
        for (int i = 2; i <= length; i++) {
            System.out.println("i = " + i);
            currNode.next = new ListNode(i);
            currNode = currNode.next;
        }
        printLinkedList(head);
        return head;
    }

    public static ListNode implementSingleList() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        System.out.println(one.val);
        System.out.println(two.val);
        System.out.println(three.val);
        System.out.println(four.val);
        System.out.println(five.val);

        printLinkedList(one);
        return one;
    }

    public static void printLinkedList(ListNode node) {
        System.out.print("Linked list = [");

        while (node.next != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.print(node.val);
        System.out.print("]");
        System.out.println();
    }
}

class DoubleListNode {
    int val;
    DoubleListNode next;
    DoubleListNode prev;

    DoubleListNode() {
    }

    DoubleListNode(int val) {
        this.val = val;
    }

    DoubleListNode(int val, DoubleListNode next) {
        this.val = val;
        this.next = next;
        this.prev = next.prev;
    }
}

