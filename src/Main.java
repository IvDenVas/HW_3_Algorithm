
public class Main {
    public static void main(String[] args) {
        ListOne listOne = new ListOne();
        listOne.addFirst(7);
        listOne.addLast(56);
        listOne.addLast(13);
        listOne.addLast(30);
        listOne.addLast(45);
        System.out.println("Односвязный список:");
        listOne.printList();
        System.out.println("Односвязный список после разворота:");
        listOne.reverse();
        listOne.printList();
        System.out.println("\nДвухсвязный список:");
        ListTwo listTwo = new ListTwo();
        listTwo.addFirst2(21);
        listTwo.addLast(12);
        listTwo.addLast(3);
        listTwo.addLast(49);
        listTwo.addLast(105);
        listTwo.printList();
        System.out.println("Двухсвязный список после разворота:");
        listTwo.reverse();
        listTwo.printList();
        System.out.println("\nОдносвязный список после cортировки:");
        listOne.bubbleSort();
        listOne.printList();
        System.out.println("\nДвухсвязный список после cортировки:");
        listTwo.bubbleSort();
        listTwo.printList();
    }

}
