public class Test {

  public static void main(String[] args) {

    // Create and populate list A, B and C.
		ListNode listA = new ListNode(1);
		listA.next = new ListNode(2);
		listA.next.next = new ListNode(3);
		listA.next.next.next = new ListNode(4);

		ListNode listB = new ListNode(5);
		listB.next = new ListNode(6);
		listB.next.next = new ListNode(7);
		listB.next.next.next = new ListNode(8);

		ListNode listC = new ListNode(9);
		listC.next = new ListNode(10);
		listC.next.next = new ListNode(11);
		listC.next.next.next = new ListNode(12);

    // Print out lists.
		System.out.println("List A:");
    ListNode tempA = listA;

		while (tempA.next != null) {

			System.out.print(tempA.val + " ");
			tempA = tempA.next;

		}

    System.out.print(tempA.val);
    // End of print list A.

    System.out.println("\nList B:");
    ListNode tempB = listB;

		while (tempB.next != null) {

			System.out.print(tempB.val + " ");
			tempB = tempB.next;

		}

    System.out.print(tempB.val);
    // End of print list B.

    System.out.println("\nList C:");
    ListNode tempC = listC;

		while (tempC.next != null) {

			System.out.print(tempC.val + " ");
			tempC = tempC.next;

		}

    System.out.print(tempC.val);
    // End of print list C.

    System.out.println("\nMerged list:");

    // Build array.
    ListNode[] lists = {listA, listB, listC};

    // Merge.
    ListNode newList = Solution.mergeKLists(lists);

    // Return new list.
    ListNode tempNew = newList;

		while (tempNew.next != null) {

			System.out.print(tempNew.val + " ");
			tempNew = tempNew.next;

		}

    System.out.print(tempNew.val);
    // End of print merged list.

	}

}
