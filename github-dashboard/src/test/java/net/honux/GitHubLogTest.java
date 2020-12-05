package net.honux;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class GitHubLogTest {

    private final String ID= "honux77";
    private final String REPO= "live-study";
    private final int ISSUE = 1;

    @Test
    void getIssue() {
        assertThat(GitHubLog.getIssue(ID, REPO, ISSUE)).isEqualTo("hello");
    }

    @Test
    void findAllIssueCommenter() {
        assertThat(GitHubLog.getIssue(ID, REPO, ISSUE)).hasSize(1).contains(ID);
    }
}