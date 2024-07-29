package com.example.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Entity.EntityData;
import com.example.Repository.Repository;

@Controller
public class controller {

	 @Autowired
	    private Repository repo;

	    @GetMapping("/index")
	    public String index() {
	        return "index"; 
	    }

	    @PostMapping("/view")
	    public String saveUser(@ModelAttribute EntityData user) {
	        System.out.println(user);
	        repo.save(user);
	        return "redirect:/index";
	    }

	    @GetMapping("/view")  
	    public String view(Model m) {
	        List<EntityData> user = repo.findAll();
	        m.addAttribute("user", user);
	        return "view";
	    }

	    @GetMapping("/update/{id}")
	    public String showUpdateForm(@PathVariable("id") int id, Model model) {
	        EntityData entity = repo.findById(id).get();
	        model.addAttribute("user", entity);
	        return "update";
	    }

	    @PostMapping("/update/{id}")
	    public String updateStudent(@PathVariable("id") int id, @ModelAttribute EntityData user) {
	        EntityData entity = repo.findById(id).get();
	        entity.setName(user.getName());
	        entity.setDegree(user.getDegree());
	        repo.save(entity);
	        return "redirect:/view";
	    }

	    @PostMapping("/delete/{id}")
	    public String delete(@PathVariable("id") int id) {
	        repo.deleteById(id);
	        return "redirect:/view";
	    }

}
