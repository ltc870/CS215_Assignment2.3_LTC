/**
 * A class that implements a queue of objects by using a chain of linked nodes
 * that has both head and tail references.
 * 
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 5.0
 */
public final class LinkedQueue<T> implements QueueInterface<T> {
	private Node<T> firstNode; // References node at front of queue
	private Node<T> lastNode; // References node at back of queue

	public LinkedQueue() {
		firstNode = null;
		lastNode = null;
	} // end default constructor

	public void enqueue(T newEntry) {

		Node<T> newNode = new Node<T>(newEntry, null);

		if (isEmpty())
			firstNode = newNode;
		else
			lastNode.setNextNode(newNode);

		lastNode = newNode;
	}

	public T getFront() {
		if (isEmpty())
			throw new EmptyQueueException("Queue is empty");
		else
			return firstNode.getData();
	} // end getFront

	public T dequeue() {
		T front = getFront(); // Might throw EmptyQueueException
		// Assertion: firstNode != null
		firstNode.setData(null);
		firstNode = firstNode.getNextNode();

		if (firstNode == null)
			lastNode = null;

		return front;
	} // end dequeue

	public boolean isEmpty() {
		return (firstNode == null) && (lastNode == null);
	} // end isEmpty

	public void clear() {
		firstNode = null;
		lastNode = null;
	} // end clear
	
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