package business.concretes;


import business.abstracts.CourseService;
import core.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager implements CourseService {

    private CourseDao courseDao;
    private Logger[] loggers;
    private Course[] courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses){
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    @Override
    public void add(Course course) throws Exception {
        for (Course courses : courses){
            if(courses.getName() == course.getName() && courses!=course){
                throw new Exception("Aynı isme sahip kurs mevcuttur: "+course.getName());
            }
        }
        if(course.getUnitPrice()<0){
            throw new Exception("Kurs fiyatı 0'dan büyük olmalıdır.");
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getName());
        }


    }
}
