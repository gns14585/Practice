package P98_Practice.p31_p60.p34;

public class Member {
    private String name;
    private String job;

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return " { name : " + name + ", job : " + job + " } ";
    }
}
