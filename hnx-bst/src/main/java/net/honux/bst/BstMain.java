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
        System.out.println("Simple Binary [Not Search] Tree\n");
        var tree = BstMain.initTree();

        System.out.println("BFS");
        System.out.println(tree.bfs());
        System.out.println();

        System.out.println("DFS (Inorder)");
        System.out.println(tree.dfs());
        System.out.println();

        System.out.println("Preorder");
        System.out.println(tree.preorder());
        System.out.println();

        System.out.println("Postorder");
        System.out.println(tree.postorder());
        System.out.println();

    }
}
