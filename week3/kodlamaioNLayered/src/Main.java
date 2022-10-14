import business.concretes.CourseManager;
import core.abstracts.Logger;
import core.concretes.DatabaseLogger;
import core.concretes.EmailLogger;
import core.concretes.FileLogger;
import dataAccess.concretes.hibernate.HibernateCourseDao;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[]loggers1 = {new DatabaseLogger(),new FileLogger(),new EmailLogger()};
        //Course[] courses1 ={new Course(1,"Java","engin",0),new Course(2,"Java","kadir",1)};
        Course[] courses1 ={new Course(1,"Java","engin",0),new Course(2,"C#","kadir",1)};
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers1,courses1);

        for(Course course:courses1) {
            courseManager.add(course);
            System.out.println("--------------------------");
        }
    }
}
