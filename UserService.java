package homework;

import java.util.List;

public class UserService {
    User createUser(String name){
        return new User(name);
    }
    
    void saveUser(User user){
        Saver saver = new Saver(user);
        saver.save(user);
    }

    void reportUser(User user){
        Reporter reporter = new Reporter(user);
        reporter.report(user);
    }
}

