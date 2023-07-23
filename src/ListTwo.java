public class ListTwo {
    private Node head;
    private Node tail;


    private class Node {
        private Node next;
        private Node prev;
        private int value;

        public Node(int value) {
            this.next = null;
            this.prev = null;
            this.value = value;
        }
    }
    public void addFirst2(int value) {
        Node node = new Node(value);
        node.value = value;
        if (head != null) {
            node.next = head;
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
    }
    public void addLast(int value) {
        Node node = new Node(value);
        node.value = value;
        if (tail != null) {
            node.prev = tail;
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
    }
    public void printList() {
        Node node = head;
        while (node != null)
        {
            System.out.print(node.value + " —> ");
            node = node.next;
        }
        System.out.println("null");
    }
    public void reverse() {
        Node node = head;
        Node temp = head;
        head = tail;
        tail = temp;
        while (node != null) {
            temp = node.next;
            node.next = node.prev;
            node.prev = temp;
            node = node.prev;
        }

    }
    public void bubbleSort() {
        boolean flag = true;

        while (flag) {
            Node node = head;
            flag = false;
            while (node.next != null) {
                if (node.value > node.next.value) {
                    int temp = node.value;
                    node.value = node.next.value;
                    node.next.value = temp;
                    flag = true;
                }
                node = node.next;
            }
        }

    }
    public void sort() {
        boolean needSort;
        do {
            needSort = false;
            Node node = head;
            while (node != null && node.next != null){
                if (node.value > node.next.value){
                    Node before = node.prev;
                    Node after = node.next.next;
                    Node current = node;
                    Node next = node.next;

                    current.next = after;
                    current.prev = next;
                    next.next = current;
                    next.prev = before;
                    if (before != null){
                        before.next = next;
                    } else {
                        head = next;
                    }
                    if (after != null) {
                        after.prev = current;
                    } else  {
                        tail = current;
                    }

                    needSort = true;
                }
                node = node.next;
            }
        } while (needSort);
    }
}
