class Candidate extends User {
    private String skills;
    private String resume;

    public Candidate(String name, String email, String skills, String resume) {
        super(name, email);
        this.skills = skills;
        this.resume = resume;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Candidate Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Skills: " + skills);
    }

    public String getResume() {
        return resume;
    }
}