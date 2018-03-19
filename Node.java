/**
 * Created by BelSi1731422 on 2018-03-19.
 */
public class Node<T> {
    private Node next;
    private T contenue;

    public Node(T contenue) {
        this.contenue = contenue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getContenue() {
        return contenue;
    }

    public void setContenue(T contenue) {
        this.contenue = contenue;
    }
}
