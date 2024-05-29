public class Main {
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("John Doe", "john@example.com", "Java, Python", "resume.pdf");
        Interviewer interviewer1 = new Interviewer("Alice Smith", "alice@example.com", "Software Engineering");

        Interview liveInterview = new LiveInterview(candidate1, interviewer1);
        Interview automatedInterview = new AutomatedInterview(candidate1);

        InterviewSystem interviewSystem = InterviewSystem.getInstance();

        // Conduct live interview
        interviewSystem.scheduleInterview(liveInterview);

        // Conduct automated interview
        interviewSystem.scheduleInterview(automatedInterview);

        // Generate and review report
        InterviewReport report = new InterviewReport(candidate1.name, "Automated Interview", "Pass");
        interviewer1.reviewReport(report);
    }
}
