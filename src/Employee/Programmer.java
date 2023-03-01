package Employee;

public class Programmer extends Employee implements Trainable {
    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void attendTraining() {
        System.out.println("Attending training...");
    }

    public Programmer(String name, int age, String company, String language) {
        super(name, age, company);
        this.language = language;
    }
}
