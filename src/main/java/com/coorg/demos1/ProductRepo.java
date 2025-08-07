package com.coorg.demos1;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface productrepo extends JpaRepository<product1, Integer> {
//	
//	
//
//}
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{


}
