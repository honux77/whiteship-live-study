package net.honux.bst;

public class BinaryTree <T> {

    private Node <T> head;
    private int size;

    public BinaryTree(T value) {
        this.head = new Node<>(value);
        this.size = 1;
    }

    public Node<T> getHead() {
        return head;
    }

    public void addLeft(T value, Node<T> node) {
        node.setLeft(new Node(value));
    }

    public void addRight(T value, Node<T> node) {
        node.setRight(new Node(value));
    }


}
