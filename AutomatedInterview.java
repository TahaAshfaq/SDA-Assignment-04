class AutomatedInterview implements Interview {
    private Candidate candidate;

    public AutomatedInterview(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public void conductInterview() {
        System.out.println("Conducting automated interview with " + candidate.name);
        // Logic for automated interview
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report for automated interview");
        // Logic to generate report
    }
}