class InterviewSystem {
    private static InterviewSystem instance;

    private InterviewSystem() {
        // Private constructor to prevent instantiation
    }

    public static InterviewSystem getInstance() {
        if (instance == null) {
            instance = new InterviewSystem();
        }
        return instance;
    }

    public void scheduleInterview(Interview interview) {
        interview.conductInterview();
        interview.generateReport();
    }
}
