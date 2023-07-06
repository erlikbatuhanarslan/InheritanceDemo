package Business;

import  Entities.Instructor;
import Entities.User;
import Logger.Logger;

public class InstructorManager extends UserManager{
    public InstructorManager(Logger logger) {
        super(logger);
    }

    public void add(Instructor instructor) {
        System.out.println("Instructor : " + instructor.getFirstName() + " " + instructor.getLastName() +
                " Branch : " + instructor.getBootCampName());
    }

}
