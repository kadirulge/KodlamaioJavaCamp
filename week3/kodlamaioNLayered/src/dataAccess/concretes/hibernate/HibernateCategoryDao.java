package dataAccess.concretes.hibernate;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile kategori veri tabanına eklendi!");

    }
}
