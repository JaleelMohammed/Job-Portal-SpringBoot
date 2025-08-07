package com.coorg.demos1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemosApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemosApplication.class, args);
		
//		ProductService serv =context.getBean(ProductService.class);

//		Product p1 = context.getBean(Product.class);
//		
//		p1.setId(102);
//		p1.setTitle("python");
//		p1.setDecr("bakend developer");
//		p1.setExperience(1);
//		p1.setTech("python, sql");
//		
//		serv.save(p1);
//		System.out.print(serv.findAll());
		
		
	}

}
