package dataAccess.concretes.jdbc;

import dataAccess.abstracts.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile kurs veri tabanına eklendi!");

    }
}
