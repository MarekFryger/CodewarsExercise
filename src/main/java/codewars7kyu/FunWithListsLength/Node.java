package codewars7kyu.FunWithListsLength;


class Node<T> {
    public Object data;
    public Node next;

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this(data, null);
    }
}