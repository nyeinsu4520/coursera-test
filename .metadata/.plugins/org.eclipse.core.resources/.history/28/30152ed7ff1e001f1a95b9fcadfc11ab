package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	@GetMapping("/categories")
	public String viewCategories(Model model) {
		
		List<Category> categoryList=categoryRepo.findAll();// select *from category
		model.addAttribute("categoryList",categoryList);
		return "view_Categories";
	}
	
	
	@GetMapping("/category/edit/{id}")
	public String editCategory(@PathVariable("id")Integer id,Model model) {
		Category category= categoryRepo.getReferenceById(id);
		model.addAttribute("category",category);
		return "edit_category";
	}
	
	@PostMapping("/category/edit/{id}")
	public String saveCategory(@PathVariable("id")Integer id, Category category) {
		categoryRepo.save(category);
		return "redirect:/categories";
	}
	
	
	@GetMapping("/category/delete/{id}")
	public String deleteCategory(@PathVariable("id") Integer id) {
		Category category=categoryRepo.getReferenceById(id);
		categoryRepo.delete(category);
		return "redirect:/categories";
	}
	
	
}
