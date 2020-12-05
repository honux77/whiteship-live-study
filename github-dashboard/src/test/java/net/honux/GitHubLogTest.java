package net.honux;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class GitHubLogTest {

    private final int ISSUE = 1;
    private final String REPO = "honux77/whiteship-live-study";
    private GitHubLog gh;

    @BeforeEach
    void setup() {
        gh = new GitHubLog(REPO);
    }

    @Test
    void getIssue() {
        assertThat(gh.getIssue(ISSUE)).isEqualTo("hello, issue!");
    }

    @Test
    void findAllIssueCommenter() {
        String user = "honux77";
        assertThat(gh.findAllIssueCommenter(ISSUE)).hasSize(2).contains(user);
    }
}