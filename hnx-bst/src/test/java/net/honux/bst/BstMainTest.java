package net.honux.bst;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class BstMainTest {

    BinaryTree<Integer> tree;

    @BeforeEach
    void init () {
        tree = new BinaryTree<>(1);
        tree.addLeft(2, tree.getHead());
        tree.addRight(3, tree.getHead());
        tree.addLeft(4, tree.getHead().left());
        tree.addRight(5, tree.getHead().left());
        tree.addRight(6, tree.getHead().right());
    }

    @DisplayName("Node 테스트")
    @Test
    void node() {
        Node<Integer> node = new Node<>(10);
        assertThat(node.getValue()).isEqualTo(10);
    }

    @DisplayName("트리 생성 테스트")
    @Test
    void treeInit() {
        assertThat(tree.getHead().getValue()).isEqualTo(1);
        assertThat(tree.getHead().left().getValue()).isEqualTo(2);
        assertThat(tree.getHead().right().getValue()).isEqualTo(3);
        assertThat(tree.getHead().left().left().getValue()).isEqualTo(4);
        assertThat(tree.getHead().left().right().getValue()).isEqualTo(5);
        assertThat(tree.getHead().right().right().getValue()).isEqualTo(6);
    }

    @Test
    void dfs() {
        assertThat(tree.dfs()).isEqualTo("425136");
    }

}