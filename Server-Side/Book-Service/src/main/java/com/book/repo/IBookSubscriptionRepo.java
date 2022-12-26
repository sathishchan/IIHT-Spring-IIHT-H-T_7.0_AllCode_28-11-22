package com.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.Entity.BookSubscription;

@Repository
public interface IBookSubscriptionRepo extends JpaRepository<BookSubscription, Long> {
	
	//@Query("select t.book from BookSubscription t where t.subName = :username and t.isSubscribed = true")
	//List<Book> findAllbooksBySubscription(@Param("username") String username);
	
	//@Query("select t.book from BookSubscription t where t.subName = :username and t.id = :subscribeId and t.isSubscribed = true")
	//Book findbookBySubscriptionIdandUsername(@Param("username") String username, @Param("subscribeId") Long subscribeId);
	
	//@Query("select t from BookSubscription t where t.subName = :username and t.book.id = :bookId and t.isSubscribed = true")
	//BookSubscription findBookByusernameandbookId(@Param("username") String username, @Param("bookId") Long bookId);
	
	//@Query("select t from BookSubscription t where t.book.id = :bookId and t.isSubscribed = true")
	//List<BookSubscription> findAllBookBybookId(@Param("bookId") Long bookId);

}