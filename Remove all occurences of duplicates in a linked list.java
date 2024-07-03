class Solution {
    public Node removeAllDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node prev = null;
        Node newHead = null;

        while (current != null) {
            boolean isDuplicate = false;
            
            while (current.next != null && current.data == current.next.data) {
                current = current.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                current = current.next;
            } else {
                
                if (newHead == null) {
                    newHead = current;
                } else {
                    prev.next = current;
                }
                
                prev = current;
                
                current = current.next;
            }
        }

        
        if (prev != null) {
            prev.next = null;
        }

        return newHead;
    }
}
