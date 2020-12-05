package net.honux;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class StudyTest {

    Study s;
    final String REPO = "honux77/whiteship-live-study";
    final String user1 = "honux77";
    final String user2 = "codesquad-honux";

    @BeforeEach
    void setup() {
        s = new Study(REPO);
    }

    @Test
    void updateStatistics() {
        assertThat(s.updateStatistic(1, 2)).hasSize(2);
        assertThat(s.updateStatistic(1, 2).get(user1)).isEqualTo(1);
        assertThat(s.updateStatistic(1, 2).get(user2)).isEqualTo(1);
    }
}
