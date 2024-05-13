public class Node<T> {
    private T data;
    private Node<T> next;

    // For the constructors. don't need to specify the type parameters again since the class definition already defines it i.e. Node<T> is not required
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public Node(T data) {
        this(data, null);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
