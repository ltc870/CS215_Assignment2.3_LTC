public class Node<T> {
	
	private T data; // Entry in queue
	private Node<T> next; // Link to next node

	public Node() {
		data = null;
		next = null;
	} // end constructor

	public Node(T dataPortion, Node<T> linkPortion) {
		data = dataPortion;
		next = linkPortion;
	} // end constructor

	public T getData() {
		return data;
	} // end getData

	public void setData(T newData) {
		data = newData;
	} // end setData

	public Node<T> getNextNode() {
		return next;
	} // end getNextNode

	public void setNextNode(Node<T> nextNode) {
		next = nextNode;
	} // end setNextNode
} // end Node