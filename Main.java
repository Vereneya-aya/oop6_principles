package homework;

public class Main{
    public static void main(String[] args){
        UserService userService = new UserService();
        User u1 = userService.createUser("John");
        userService.saveUser(u1);
        userService.reportUser(u1);
    }
}
