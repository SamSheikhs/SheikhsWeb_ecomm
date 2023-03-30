package com.sheikhweb.major.service;


import com.sheikhweb.major.model.Category;
import com.sheikhweb.major.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllcategory(){
        return  categoryRepository.findAll();
    }
    public  void addCategory(Category category){
        categoryRepository.save(category);
    }

}
