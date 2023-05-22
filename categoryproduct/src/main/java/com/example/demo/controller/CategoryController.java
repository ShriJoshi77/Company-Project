package com.example.demo.controller;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Category;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("categoryAPI")
public class CategoryController {

	@Autowired
	CategoryService service;

	@GetMapping("/getid")
	public List<Category> GetId() {
		return service.GetId();

	}

	@PostMapping("/newrecord")
	public Category savedata(@RequestBody Category category) {
		System.out.println(category);
		service.savedata(category);
		return category;

	}

	@PutMapping("/updcategory")
	Category UpdateCategory(@RequestBody Category category) {
		return service.UpdateCategory(category);
	}

	@DeleteMapping("/delcategory/{cid}")
	public Category deletecategory(@PathVariable int cid) {

		return service.deletecategory(cid);
	}

	@RequestMapping("/fetchallcategory")
	public List<Category> getallcategory() {

		return service.getallcategory();

	}

	@RequestMapping("fetchcategory/{cid}")
	public Category getCategory(@PathVariable int cid) {
		Category category = service.getCategory(cid);
		if (category == null) {
			System.out.println("record not found");
			// raising exception using throw keyword
		} else {
			return category;
		}
		return category;

	}
}
