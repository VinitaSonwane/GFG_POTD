class Solution {
    public Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Node prev = null;
        Node temp = head;
        Node next = head.next;
        while (next != null) {
            temp.next = prev;
            prev = temp;
            temp = next;
            next = temp.next;
        }
        temp.next = prev;

        return temp;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        Node head = l1;
        Node tail = null;
        int carry = 0;

        while (l1 != null && l2 != null) {
            l1.data += carry + l2.data;
            carry = l1.data / 10;
            l1.data %= 10;
            tail = l1;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l2 != null) {
            tail.next = l2;
            l1 = l2;
        }

        while (l1 != null) {
            l1.data += carry;
            carry = l1.data / 10;
            l1.data %= 10;
            tail = l1;
            l1 = l1.next;
        }

        if (carry > 0) {
            tail.next = new Node(carry % 10);
            tail = tail.next;
            carry /= 10;
        }

        return head;
    }

    public Node addTwoLists(Node num1, Node num2) {
        // Removing leading zeros - assuming single node lists are non-zero
        while (num1 != null && num1.next != null && num1.data == 0) {
            num1 = num1.next;
        }
        while (num2 != null && num2.next != null && num2.data == 0) {
            num2 = num2.next;
        }

        num1 = reverse(num1);
        num2 = reverse(num2);

        return reverse(addTwoNumbers(num1, num2));
    }
}
