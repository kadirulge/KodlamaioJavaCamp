package business.concretes;

import business.abstracts.CategoryService;
import core.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.CourseDao;
import entities.Category;
import entities.Course;

public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;
    private Logger[] loggers;
    private Category[] categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    @Override
    public void add(Category category) throws Exception {
        for (Category categories : categories){
            if(categories.getName() == category.getName() && categories!=category){
                throw new Exception("Aynı isme sahip kategori mevcuttur: "+category.getName());
            }
        }

        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getName());
        }


    }
}
