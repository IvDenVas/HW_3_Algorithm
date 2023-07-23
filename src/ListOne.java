public class ListOne {
    private Node head;

    public static class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public void addFirst(int value){
        Node node = new Node(value);
        node.value = value;
        node.next = head;
        head = node;
    }
    public void addLast(int value) {
        Node node = new Node(value);
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
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

    public void reverse()
    {
        Node node = head;
        Node prev = null;

        while (node != null)
        {
            Node next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        head = prev;
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
}
