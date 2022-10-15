package business.concretes;

import business.abstracts.InstructorService;
import core.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class InstructorManager implements InstructorService {

    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getName());

        }

    }
}
