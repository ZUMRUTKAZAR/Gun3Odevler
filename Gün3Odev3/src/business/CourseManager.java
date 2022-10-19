package business;

import core.Logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;



    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        super();
        this.courseDao = courseDao;
        this.loggers = loggers;
    }



    public void add(Course course) {

        if(course.getUnitPrice() >= 0) {
            courseDao.add(course);

            for (Logger logger :loggers ) {
                logger.log(course.getCourseName());
            }
        }

        else {
            System.out.println("Kurs fiyatı sıfırdan küçük olamaz");
        }
    }

}
