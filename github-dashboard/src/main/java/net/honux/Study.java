package net.honux;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Study {

    private GitHubLog gh;
    private int total;
    private Map<String, Integer> userInfo;;

    public Study(String repo) {
        gh = new GitHubLog(repo);
    }

    public final Map<String, Integer> updateStatistic(int start, int end) {
        userInfo = new HashMap<>();
        total = end - start + 1;
        for (int i = start; i <= end; i++) {
            Map <String, Boolean> checkList = new HashMap<>();
            String[] users = gh.findAllIssueCommenter(i);
            if (users == null || users.length == 0) continue;

            for (var user : users) {
                int score = userInfo.getOrDefault(user, 0);
                userInfo.put(user, score + 1);
            }
        }

        if (userInfo.size() == 0) return null;
        return userInfo;
    }

    public void printStatus() {
        for (var user : userInfo.entrySet()) {
            System.out.println(user.getKey() + ": " + (double) user.getValue() / total);
        }
    }

}
