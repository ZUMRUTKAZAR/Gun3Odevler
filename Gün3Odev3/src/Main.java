import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.Logging.DatabaseLogger;
import core.Logging.EmailLogger;
import core.Logging.FileLogger;
import core.Logging.Logger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

    public static void main(String[] args) {
        Logger[] loggers = { new DatabaseLogger(),new FileLogger(),new EmailLogger()};

        Category category1 = new Category(2, "Mobile");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);

        Course course1 = new Course(3, "Project", 75);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);

        Instructor instructor = new Instructor(1, "Engin Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);
    }
        }

