public class MoodleAccountBuilder {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    public MoodleAccountBuilder(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public  MoodleAccountBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public MoodleAccountBuilder wantNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
        return this;
    }

    public MoodleAccount build() {
        return new MoodleAccount(this);
    }
}
