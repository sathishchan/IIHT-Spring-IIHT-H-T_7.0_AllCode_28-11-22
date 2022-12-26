package com.book.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.book.Entity.Book;



@Repository
public interface IBookRepo extends JpaRepository<Book, Long> {
	
	
	@Modifying
	@Query("update Book t set t.is_active = :isActive where t.id= :id")
	void updateActiveById(@Param("isActive") Boolean isActive, @Param("id") Long id);
	
	@Query("select t from Book t where "
			+ "(:title = null or t.title like (%:title%)) and "
			+ "(:author = null or t.author like (%:author%)) and "
			+ "(:publisher = null or t.publisher like (%:publisher%)) and "
			+ "(:category = null or t.category like (%:category%)) and "
			+ "t.is_active = true")
	
	List<Book> searchBooks(
			@Param("title") String title,
			@Param("author") String author,
			@Param("publisher") String publisher,
			@Param("category") String category);
	
	@Query("select t from Book t where t.author = :author")
	List<Book> findAllbooksByAuthor(@Param("author") String author);
	
	
			

}
