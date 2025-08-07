package com.coorg.demos1;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping; 


@RestController
//@RequestMapping("/api") 
@CrossOrigin(origins = "http://localhost:5173") 
public class ProductControl { 
	
	
	@Autowired
	ProductService service; 
	
	
	@GetMapping("/")
	public String getMethodName() {
		System.out.println("GET request received at /api/");
		return "welcome to backend";
	}
	
	@GetMapping("findall")
	public List<Product> getAll() {
		System.out.println("GET request received at /api/");
		return service.getAllProducts();
	}
	
	@PostMapping("/employee") 
	public ResponseEntity<String> newData(@RequestBody Product p) {
		System.out.println("In newData: POST request received for /api/employee");
		System.out.println("Received Product Data: " + p); 
		try {
			
			Product savedProduct = service.save(p); 
			System.out.println("Product saved to database: " + savedProduct);
			return ResponseEntity.ok("Job Added Successfull!!");
			
		} catch(Exception e) {
			System.err.println("Error saving product: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save employee data: " + e.getMessage());
		}
	}
}
