package com.test;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.entity.BookDetails;

@SpringBootApplication
public class DataJpaCrudRepositoryApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ctxt = 
			SpringApplication.run(DataJpaCrudRepositoryApplication.class, args);
	
	BookRepo br = ctxt.getBean(BookRepo.class);
	
	BookDetails bd = new BookDetails();
	
	bd.setBookName("Spring Boot");
	bd.setBookId(7132);
	bd.setAuthor("Gokul");
	bd.setBookPrice(500.00);
	
	br.save(bd);
	
	Optional<BookDetails> ob = br.findById(6951);
	
	System.out.println(ob.get());
	
	}

}
