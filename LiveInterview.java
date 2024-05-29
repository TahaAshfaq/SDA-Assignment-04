class LiveInterview implements Interview {
    private Candidate candidate;
    private Interviewer interviewer;

    public LiveInterview(Candidate candidate, Interviewer interviewer) {
        this.candidate = candidate;
        this.interviewer = interviewer;
    }

    @Override
    public void conductInterview() {
        System.out.println("Conducting live interview with " + candidate.name);
        // Logic for live interview
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report for live interview");
        // Logic to generate report
    }
}