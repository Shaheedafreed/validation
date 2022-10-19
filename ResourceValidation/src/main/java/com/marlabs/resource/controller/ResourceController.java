package com.marlabs.resource.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.marlabs.resource.entity.ResourceEntity;
import com.marlabs.resource.service.ResourceService;

@Controller
public class ResourceController {
	
	@Autowired
	private ResourceService service;
	
	@GetMapping("/form")
	public String openForm(Model model)
	{	
		List<ResourceEntity> emp=service.getAllResource();
		model.addAttribute("emp",emp);
		return "form";
	}
	
	@GetMapping("/addemp")    
	public String addEmp()
	{
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String registerForm(@ModelAttribute  ResourceEntity entity, HttpSession session )
	{
		System.out.println(entity);
		service.addResource(entity);
		session.setAttribute("message", "Resource Details Added Successfylly.....");
		return "redirect:/form";
	}
	
	public void uploadFile(@RequestParam ("file") MultipartFile file) throws IllegalStateException, IOException {
		service.uploadFile(file);
	}
	
//	@GetMapping("/redirect/{resourceId}")
//	public String deleteResource( @PathVariable String resourceId,  HttpSession session)
//	{
//		
//		service.deleteResource(resourceId);
//		session.setAttribute("message", "Resource Deleted Successfylly.....");
//
//		return "redirect:/form";
//	}
	
//	@GetMapping("/downloadFile/{fileName:.+}")
//    public ResponseEntity < Resource > downloadFile(@PathVariable String fileName, HttpServletRequest request) {
//        // Load file as Resource
//        DatabaseFile databaseFile = fileStorageService.getFile(fileName);
//
//        return ResponseEntity.ok()
//            .contentType(MediaType.parseMediaType(databaseFile.getFileType()))
//            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + databaseFile.getFileName() + "\"")
//            .body(new ByteArrayResource(databaseFile.getData()));
//    }
	
}
