package Business;

import Entities.User;
import Logger.Logger;

public class UserManager {
    public UserManager(Logger logger) {
        logger.log();
    }
    public void add(User user) {

        System.out.println("User : " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Welcome to the Kodlama.io family!");
        System.out.println("Password : " + user.getPassword());
    }

}
