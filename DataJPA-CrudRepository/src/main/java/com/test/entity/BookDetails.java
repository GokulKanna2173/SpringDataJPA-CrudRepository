package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BookDetails {
	
	@Id
	private Integer bookId;
	private String bookName;
	private String Author;
	private Double bookPrice;

}
