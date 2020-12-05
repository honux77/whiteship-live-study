package net.honux;

import org.kohsuke.github.*;

import javax.print.DocFlavor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GitHubLog {

    private static final String REPO= "honux77/whiteship-live-study";
    private GHRepository repo;

    public GitHubLog() {
        repo = getRepo();
    }

    public String getIssue(int num) {
        try {
            GHIssue issue = repo.getIssue(num);
            return issue.getBody();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String[] findAllIssueCommenter(int issueNum) {
        List<GHIssueComment> comments = null;
        try {
            comments = repo.getIssue(issueNum).getComments();
            String[] users = new String[comments.size()];
            for (int i = 0;i < comments.size(); i++) {
                users[i] = comments.get(i).getUser().getLogin();
            }
            return users;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private GHRepository getRepo() {
        GitHub gh = null;
        try {
            gh = GitHub.connect();
            return gh.getRepository(REPO);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
