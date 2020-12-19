package net.honux.bst;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class BstMainTest {

    @DisplayName("테스트가 잘 되는지 테스트")
    @Test
    void test() {
        BstMain main = new BstMain();
        assertThat(main.foo()).isEqualTo(1);
    }
}