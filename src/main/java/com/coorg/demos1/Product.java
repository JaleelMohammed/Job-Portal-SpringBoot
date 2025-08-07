package com.coorg.demos1;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//
//@Entity
//public class product1{
//     
//	@Id
//	private int id ;
//	private String name1;
//	
//	@Override
//	public String toString() {
//		return "product [id=" + id + ", name=" + name1 + "]";
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name1;
//	}
//	public void setName(String name) {
//		this.name1 = name;
//	}
//	
//}import java.util.Arrays;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Scope("prototype")
//@Component
@Entity
public class Product {
	
	@Id
	public int id;
	public String title;
	public String desci;
	public int experience;
	public String tech;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDecr() {
		return desci;
	}
	public void setDecr(String decr) {
		this.desci = decr;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", decr=" + desci + ", experience=" + experience + ", tech="
				+ tech + "]";
	}
	

}



