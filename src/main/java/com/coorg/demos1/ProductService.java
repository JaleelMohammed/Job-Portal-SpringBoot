package com.coorg.demos1;

import java.util.List;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RestController;
//
//@Service
//public class productser {
// 
//	@Autowired
//	productrepo rep;
//	
//	public void save(product1 p) {
//		rep.save(p);
//		System.out.print("addded");
//	}
//	
//	
//	public List<product1> findAll(){
//		return rep.findAll();
//	}
//}


//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//
//@Component
//public class ProductService {
//	
//	
//	@Autowired
//	ProductRepo Repo;
//	
//	public void save(Product p) {
//		
//		Repo.save(p);
//		System.out.print("addded");
//		
//	}
//	
//	public List<Product> findAll(){
//		
//		return Repo.findAll();
//	}
//
//}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ProductService {

    @Autowired
    private ProductRepo productRepo; 

    
    public Product save(Product p) {
       
        System.out.println("Saving product to database: " + p);
        return productRepo.save(p); 
    }
    

    
    // Example: Method to get all products
     public List<Product> getAllProducts() {
       return productRepo.findAll();
     }

}


