package net.honux.bst;

public class BinaryTree <T> {

    private Node <T> head;
    private int size;
    private StringBuffer traveller;

    public BinaryTree(T value) {
        this.head = new Node<>(value);
        this.size = 1;
    }

    public Node<T> getHead() {
        return head;
    }

    public String dfs() {
        traveller = new StringBuffer();
        inorder(head);
        return traveller.toString();
    }

    private void inorder(Node<T> node) {
        if (node == null) return;
        inorder(node.left());
        traveller.append(node.getValue());
        inorder(node.right());
    }

    public void addLeft(T value, Node<T> node) {
        node.setLeft(new Node(value));
    }

    public void addRight(T value, Node<T> node) {
        node.setRight(new Node(value));
    }


}
