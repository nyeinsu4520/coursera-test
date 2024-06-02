package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;


@Controller
public class ItemController {
	@Autowired
	private ItemRepository itemRepo;
	@Autowired
	private CategoryRepository categoryRepo;
	
	
	@GetMapping("/view")
	public String viewItems(Model model) {
		List<Item> itemList= itemRepo.findAll();
		model.addAttribute("itemList",itemList);
		return "view_items";
	}
	
	@GetMapping("/add")
	public String addItem(Model model) {
		model.addAttribute("item",new Item());
		List<Category> categorylist=categoryRepo.findAll();
		model.addAttribute("categorylist",categorylist);
		return "add_item";
	}
	
	
	@PostMapping("/save")
	public String saveItem(@Valid Item item,BindingResult bindingResult, @RequestParam("itemImage") MultipartFile imgFile,Model model) {
	if(bindingResult.hasErrors()) {
		List<Category> categorylist=categoryRepo.findAll();
		model.addAttribute("categorylist",categorylist);
		return "add_item";
	}
	
	String imageName = imgFile.getOriginalFilename();
	// set the image name in item object
	item.setImgname(imageName);
	// save the item obj to the db
	Item savedItem = itemRepo.save(item);
	try {
	// prepare the directory path
	String uploadDir = "uploads/items/" + savedItem.getId();
	Path uploadPath = Paths.get(uploadDir);
	// check if the upload path exists, if not it will be created
	if (!Files.exists(uploadPath)) {
	Files.createDirectories(uploadPath);
	}
	// prepare path for file
	Path fileToCreatePath = uploadPath.resolve(imageName);
	System.out.println("File path: " + fileToCreatePath);
	// copy file to the upload location
	Files.copy(imgFile.getInputStream(), fileToCreatePath, StandardCopyOption.REPLACE_EXISTING);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	itemRepo.save(item);
	return "redirect:/view";
	}
	
	
	@GetMapping("/view/{id}")
	public String viewsingle(@PathVariable("id") Integer id,Model model) {
		Item item=itemRepo.getReferenceById(id);
		model.addAttribute("item",item);
		return "view_single_item";
	}
	
	
	@GetMapping("/item/edit/{id}")
	public String editItem(@PathVariable("id") Integer id,Model model) {
		Item item=itemRepo.getReferenceById(id);
		model.addAttribute("item",item);
		List<Category> categorylist=categoryRepo.findAll();
		model.addAttribute("categorylist",categorylist);
		return "edit_item";
	}
	
	@PostMapping("/item/edit/{id}")
	public String saveItem(@PathVariable("id")Integer id, Item item, @RequestParam("itemImage") MultipartFile imgFile)  {
			String imageName = imgFile.getOriginalFilename();
			// set the image name in item object
			item.setImgname(imageName);
			// save the item obj to the db
			Item savedItem = itemRepo.save(item);
			try {
			// prepare the directory path
			String uploadDir = "uploads/items/" + savedItem.getId();
			Path uploadPath = Paths.get(uploadDir);
			// check if the upload path exists, if not it will be created
			if (!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
			}
			// prepare path for file
			Path fileToCreatePath = uploadPath.resolve(imageName);
			System.out.println("File path: " + fileToCreatePath);
			// copy file to the upload location
			Files.copy(imgFile.getInputStream(), fileToCreatePath, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			return "redirect:/view";
	}
	
	
	@GetMapping("item/delete/{id}")
	public String deleteItem(@PathVariable("id") Integer id) {
		Item item=itemRepo.getReferenceById(id);
		itemRepo.delete(item);
		return "redirect:/view";
	}

}
