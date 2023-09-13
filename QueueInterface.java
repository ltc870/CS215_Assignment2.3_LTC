
	/**
	 * QueueADT defines the interface to a queue collection.
	 *
	 * @author Java Foundations
	 * @version 4.0
	 */
	public interface QueueInterface<T> {
		
		/**
		 * Adds one element to the rear of this queue.
		 * @param element the element to be added to the rear of the queue
		 */
		public void enqueue(T element);

		/**
		 * Removes and returns the element at the front of this queue.
		 * @return the element at the front of the queue
		 */
		public T dequeue();

		/**
		 * Returns the entry at the front of this queue.
		 * @return The object at the front of the queue.
		 * @throws Empty QueueException if the queue is empty.
		 */
		public T getFront();

		/**
		 * Returns true if this queue contains no elements.
		 * @return true if this queue is empty
		 */
		public boolean isEmpty();

		
		/**
		 *  Removes all entries from this queue.
		 */
		public void clear();

	}
