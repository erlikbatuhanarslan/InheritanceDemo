import Business.InstructorManager;
import Business.StudentManager;
import Business.UserManager;
import Entities.Instructor;
import Entities.Student;
import Logger.EmailLogger;
import Logger.DatabaseLogger;
import Logger.FileLogger;

public class Main {
    public static void main(String[] args) {
        //Eğitmen
        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demirog");
        instructor1.setNationalIdentity("123123123");
        instructor1.setBootCampName("Java");
        instructor1.setPassword("13******");

        //Öğrenciler
       Student student1 = new Student();
       student1.setId(1);
       student1.setFirstName("Batuhan");
       student1.setLastName("Arslan");
       student1.setNationalIdentity("6969696969");
       student1.setDepartment("Back-end Developer");
       student1.setPassword("01******");
       student1.setEmail("b***001**@gmail.com");

       Student student2 = new Student();
       student2.setId(2);
       student2.setFirstName("Zeynep");
       student2.setLastName("Arslan");
       student2.setNationalIdentity("1212121212");
       student2.setDepartment("Front-end Developer");
       student2.setPassword("23******");
       student2.setEmail("z***12**@gmail.com");

        System.out.println("----------------------------------------------");

        UserManager studentManager1 = new StudentManager(new DatabaseLogger());
        studentManager1.add(student1);

        System.out.println("----------------------------------------------");

        InstructorManager instructorManager1 = new InstructorManager(new EmailLogger());
        instructorManager1.add(instructor1);

    }
}