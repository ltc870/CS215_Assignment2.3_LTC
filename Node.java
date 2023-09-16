public class Node<T> {
	
	/** Class fields members */
	private T data; // Entry in queue
	private Node<T> next; // Link to next node

	/** Empty argument constructor */
	public Node() {
		data = null;
		next = null;
	} // end constructor

	/** Preferred argument constructor */
	public Node(T dataPortion, Node<T> linkPortion) {
		data = dataPortion;
		next = linkPortion;
	} // end constructor

	/** Get the object's information
	 * @return the object's data */
	public T getData() {
		return data;
	} // end getData

	/** Set the data of the object
	 * @param newData sets the new data to the current data  */
	public void setData(T newData) {
		data = newData;
	} // end setData

	/** Retrieves the data for the next node
	 * @return returns the next node. */
	public Node<T> getNextNode() {
		return next;
	} // end getNextNode

	/** Sets the next object for the queue */
	public void setNextNode(Node<T> nextNode) {
		next = nextNode;
	} // end setNextNode
} // end Node