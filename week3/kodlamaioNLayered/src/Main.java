import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import core.abstracts.Logger;
import core.concretes.DatabaseLogger;
import core.concretes.EmailLogger;
import core.concretes.FileLogger;
import dataAccess.concretes.hibernate.HibernateCourseDao;
import dataAccess.concretes.hibernate.HibernateInstructorDao;
import dataAccess.concretes.jdbc.JdbcCategoryDao;
import dataAccess.concretes.jdbc.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[]loggers = {new DatabaseLogger(),new FileLogger(),new EmailLogger()};
        //Course[] courses1 ={new Course(1,"Java","engin",0),new Course(2,"Java","kadir",1)};
        Course[] courses ={new Course(1,"Java","engin",0),new Course(2,"C#","kadir",1)};
        Category[] categories ={new Category(1,"Web Gelistirme"),new Category(2,"Oyun Programlama")};
        Instructor instructor = new Instructor( 1,"engin","demirog","engindemirog@gmail.com");

        //CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers1,courses1);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers,courses);
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers,categories);
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);

        for(Course course:courses) {
            courseManager.add(course);
            System.out.println("--------------------------");
        }
        System.out.println("**************************");
        for(Category category:categories) {
            categoryManager.add(category);
            System.out.println("--------------------------");
        }
        System.out.println("**************************");
        instructorManager.add(instructor);
    }
}
