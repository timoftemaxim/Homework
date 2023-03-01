package Employee;

public class Manager extends Employee implements Interviewer {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Manager(String name, int age, String company, String title) {
        super(name, age, company);
        this.title = title;
    }
    @Override
    public void conductInterview() {
        System.out.println("Conducting an interview...");
    }
}
