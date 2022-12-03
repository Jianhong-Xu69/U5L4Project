public class StepTracker {

    private int days;
    private int activeTracker;
    private int activeThreshold;
    private int totalSteps;

    public StepTracker(int active) {
        days = 0;
        activeTracker = 0;
        activeThreshold = active;
        totalSteps = 0;
    }

    public void addDailySteps (int steps) {
        days++;
        if (steps >= activeThreshold) {
            activeTracker++;
        }
        totalSteps += steps;
        days++;
    }

    public int activeDays() {
        return activeTracker;
    }

    public int averageSteps() {
        return (totalSteps / days);
    }
}
