package matrix;

public class DNodo<T> {
	private T data;
	private DNodo<T> current;
	public DNodo<T> getCurrent() {
		return current;
	}

	public void setCurrent(DNodo<T> current) {
		this.current = current;
	}

	private DNodo<T> previous;
	private DNodo<T> next;
	/**
         * contructor de clase DNodo
         * @param data 
         */
	public DNodo(T data) {
		this.data = data;
		previous = null;
		next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DNodo<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DNodo<T> previous) {
		this.previous = previous;
	}

	public DNodo<T> getNext() {
		return next;
	}

	public void setNext(DNodo<T> next) {
		this.next = next;
	}
}
