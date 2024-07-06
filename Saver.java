package homework;

public class Saver {
    private final User user;

    public Saver(User user){
        this.user = user;
    }

    public void save(User user){
        System.out.println("Save user: " + user);
    }

    
}
