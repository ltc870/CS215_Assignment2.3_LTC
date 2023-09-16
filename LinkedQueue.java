/**
 * A class that implements a queue of objects by using a chain of linked nodes
 * that has both head and tail references.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 5.0
 */
public final class LinkedQueue<T> implements QueueInterface<T> {
	
	/** Class field members */
	private Node<T> firstNode; // References node at front of queue
	private Node<T> lastNode; // References node at back of queue
	
	/**
	 * Empty Argument Constructor
	 */
	public LinkedQueue() {
		firstNode = null;
		lastNode = null;
	} // end default constructor

	/** Adds a new entry to the queue. 
	 * @param newEntry An object to be added to the queue. */
	public void enqueue(T newEntry) {
		Node<T> newNode = new Node<T>(newEntry, null);

		if (isEmpty())
			firstNode = newNode;
		else
			lastNode.setNextNode(newNode);

		lastNode = newNode;
	}

	/** Returns the first entry that's in the queue.
	 * @return The object that's first in the queue. 
	 * @throws EmptyQueueException if the queue is empty. */
	public T getFront() {
		if (isEmpty())
			throw new EmptyQueueException("Queue is empty");
		else
			return firstNode.getData();
	} // end getFront

	/**
	 * @return Removes the first entry in the queue.
	 * @throws EmptyQueueException if the queue is empty. */
	public T dequeue() {
		T front = getFront(); // Might throw EmptyQueueException
		// Assertion: firstNode != null
		firstNode.setData(null);
		firstNode = firstNode.getNextNode();

		if (firstNode == null)
			lastNode = null;

		return front;
	} // end dequeue

	/** 
	 * @return Returns true or false if the queue is empty or not. */
	public boolean isEmpty() {
		return (firstNode == null) && (lastNode == null);
	} // end isEmpty

	/** Clears the queue */
	public void clear() {
		firstNode = null;
		lastNode = null;
	} // end clear
	
	/** Displays the queue */
	public void displayQueue() {
		Node<T> current = firstNode;
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNextNode();
		}
		System.out.println();
	}
}
// end enqueue