# MergeKLists
This project features three files:
1. **ListNode**: The defining node for a singly-linked list data structure.
2. **Solution**: Class featuring one method: mergeKLists(), which accepts an array of ListNode lists and returns a single list containing the original lists from the array parameter.
3. **Test**: A main function demonstrating the solution.

# Time Complexity
Part of this project is to analyze the time complexity of the mergeKLists function. 

The largest contributor to time complexity is this while loop:

```java
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
```

This while loop runs **n times**, where **n** is the **number of lists in the parameter array**.

Within the while loop, there is a second while loop that runs **x times**, where **x** is the **size of the new list so far**. 
This includes whatever lists have been appended to the new list in previous iterations of the outside while loop.

This means that the time complexity roughly follows this pattern, assuming each list is roughly the same size:

```
(x) + (x+x) + (x+x+x) ... (x+x+x...x)
```

Where each grouping represents one completion of the outer while loop, and the summation of **x**'s within each grouping is equivalent to the amount of steps needed to complete the inner while loop.

The last grouping will contain **n amount** of **x** elements.

We can write this in the following way:

![Sequence](https://i.stack.imgur.com/9gIAq.png "Sequence")

This means that we have a time complexity of **O(n^2)**!


