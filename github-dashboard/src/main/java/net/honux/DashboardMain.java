package net.honux;

public class DashboardMain {

    private final static String REPO = "whiteship/live-study";

    public static void main(String[] args) {
        Study s = new Study(REPO);
        s.updateStatistic(1, 18);
        s.printStatus();
    }
}
