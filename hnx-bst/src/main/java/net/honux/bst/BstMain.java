package net.honux.bst;

public class BstMain {

    private static BinaryTree <Integer> initTree() {
        var tree = new BinaryTree<Integer>(1);
        tree.addLeft(2, tree.getHead());
        tree.addRight(3, tree.getHead());
        tree.addLeft(4, tree.getHead().left());
        tree.addRight(5, tree.getHead().left());
        tree.addRight(6, tree.getHead().right());
        return tree;
    }
    public static void main(String[] args) {
        System.out.println("Simple Binary [Not Search] Tree");
        var tree = BstMain.initTree();
        System.out.println("DFS (inorder)");
        System.out.println(tree.dfs());
    }
}
