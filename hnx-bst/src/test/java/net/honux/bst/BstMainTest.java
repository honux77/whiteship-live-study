package net.honux.bst;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class BstMainTest {

    @DisplayName("Node 테스트")
    @Test
    void nodeTest() {
        Node<Integer> node = new Node<>(10);
        assertThat(node.getValue()).isEqualTo(10);
    }

}