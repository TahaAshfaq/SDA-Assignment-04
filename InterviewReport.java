class InterviewReport {
    private String candidateName;
    private String interviewType;
    private String resultSummary;

    public InterviewReport(String candidateName, String interviewType, String resultSummary) {
        this.candidateName = candidateName;
        this.interviewType = interviewType;
        this.resultSummary = resultSummary;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void displayReport() {
        System.out.println("Report for: " + candidateName);
        System.out.println("Interview Type: " + interviewType);
        System.out.println("Result Summary: " + resultSummary);
    }
}
