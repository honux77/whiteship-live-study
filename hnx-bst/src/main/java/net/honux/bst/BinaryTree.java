package net.honux.bst;

import java.util.LinkedList;
import java.util.Queue;

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

    public String bfs() {
        traveller = new StringBuffer();
        Queue<Node> queue = new LinkedList();
        queue.add(this.head);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node == null) continue;
            traveller.append(node.getValue());
            queue.add(node.left());
            queue.add(node.right());
        }
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


    public String preorder() {
        traveller = new StringBuffer();
        preorderRecursion(head);
        return traveller.toString();
    }

    private void preorderRecursion(Node<T> node) {
        if (node == null) return;
        traveller.append(node.getValue());
        preorderRecursion(node.left());
        preorderRecursion(node.right());
    }

    public String postorder() {
        traveller = new StringBuffer();
        postorderRecursion(head);
        return traveller.toString();
    }

    private void postorderRecursion(Node<T> node) {
        if (node == null) return;
        preorderRecursion(node.left());
        preorderRecursion(node.right());
        traveller.append(node.getValue());
    }
}
