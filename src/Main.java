import Employee.*;
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager ("John Bush", 40, "Orange", "Manager");
        manager.conductInterview();
        System.out.println("Manager Title: " + manager.getTitle());

        Programmer programmer = new Programmer("Timofte Maxim", 20, "Orange", "JAVA");
        programmer.attendTraining();
        System.out.print("Programmer language: " + programmer.getLanguage());
    }
}