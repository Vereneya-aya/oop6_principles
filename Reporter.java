package homework;

public class Reporter {
    private final User user;

    public Reporter(User user){
        this.user = user;
    }

    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
    
}
