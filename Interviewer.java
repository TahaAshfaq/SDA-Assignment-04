class Interviewer extends User {
    private String department;

    public Interviewer(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Interviewer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
    }

    public void reviewReport(InterviewReport report) {
        System.out.println("Reviewing report for: " + report.getCandidateName());
        // Logic to review the report
    }
}