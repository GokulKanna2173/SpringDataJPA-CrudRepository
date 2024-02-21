package com.test;

import org.springframework.data.repository.CrudRepository;

import com.test.entity.BookDetails;

public interface BookRepo extends CrudRepository<BookDetails, Integer>{

}
