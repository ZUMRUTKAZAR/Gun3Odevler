package business;

import core.Logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;



    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        super();
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }



    public void add(Category category) {


        categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());


        }
    }
}
