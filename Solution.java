
public class Solution {

	public static ListNode mergeKLists(ListNode[] lists) {

	 // Establish counters.
	 int count = 1;
	 int size = lists.length;

         // Grab first list in array, this will be the basis of our new list.
         ListNode newList = lists[0];

	 while (count < size) {

		 // Establish a temporary pointer.
		 ListNode temp = newList;

		 // Loop pointer to the end of the list so far.
		 while (temp.next != null) {

			 temp = temp.next;

		 }

		 // Temp should currently be pointing to the last item in the list.
		 // Let's set the last node's next node equal to the next list.
		 temp.next = lists[count];
		 count++;

	 }

	 return newList;

	}

}
