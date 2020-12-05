package net.honux;

import org.kohsuke.github.*;

import javax.print.DocFlavor;
import java.io.IOException;
import java.util.*;

public class GitHubLog {

    private GHRepository repo;

    /**
     *
     * @param repoName id/repo, ex) honux77/whiteship-live-study
     */
    public GitHubLog(String repoName) {
        repo = getRepo(repoName);
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
            Set<String> users = new HashSet<>();
            for (var comment: comments) {
                users.add(comment.getUser().getLogin());
            }
            String ret[] = new String[users.size()];

            int i = 0;
            for (var user: users) {
                ret[i++] = user;
            }
            return ret;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private GHRepository getRepo(String repoName) {
        GitHub gh = null;
        try {
            gh = GitHub.connect();
            return gh.getRepository(repoName);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
