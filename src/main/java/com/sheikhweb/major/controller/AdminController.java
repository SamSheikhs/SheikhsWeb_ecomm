package com.sheikhweb.major.controller;

import com.sheikhweb.major.model.Category;
import com.sheikhweb.major.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    CategoryService categoryService;
    @GetMapping("/admin")
    public String adminHome() {
        return "adminHome";
    }

    @GetMapping("/admin/categories")
    public String adminGetCat(Model model) {
        model.addAttribute("categories",categoryService.getAllcategory());
        return "categories";
    }

    @GetMapping("/admin/categories/add")
    public String adminCatAdd(Model model) {
        model.addAttribute("category", new Category());
        return "categoriesAdd";
    }
    @PostMapping("/admin/categories/add")
    public String PostadminCatAdd(@ModelAttribute("category") Category category) {
        categoryService.addCategory(category);
        return "redirect:/admin/categories";
    }


}
