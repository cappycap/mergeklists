public class Test {

  public static void main(String[] args) {

    // Create and populate list A, B and C.
    ListNode listA = createList(1);
    ListNode listB = createList(5);
    ListNode listC = createList(9);

    // Print out lists.
    System.out.println("List A:");
    printList(listA);

    System.out.println("\nList B:");
    printList(listB);

    System.out.println("\nList C:");
    printList(listC);

    System.out.println("\nMerged list:");

    // Build array.
    ListNode[] lists = {listA, listB, listC};

    // Merge.
    ListNode newList = Solution.mergeKLists(lists);

    // Return new list.
    printList(newList);

  }

  // Function for creating incremented lists.
  public static ListNode createList(int val) {

    ListNode node = new ListNode(val);
		node.next = new ListNode(val+1);
		node.next.next = new ListNode(val+2);
		node.next.next.next = new ListNode(val+3);

    return node;

  }

  // Function for printing lists.
  public static void printList(ListNode list) {

    ListNode temp = list;

    while (temp.next != null) {

        System.out.print(temp.val + " ");
	temp = temp.next;

    }

    System.out.print(temp.val);

  }

}
