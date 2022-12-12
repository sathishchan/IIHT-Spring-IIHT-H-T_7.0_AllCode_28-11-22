package com.librarybook.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarybook.Entity.Library;
import com.librarybook.Exception.ResourceNotFoundExceptionHandler;
import com.librarybook.Repo.ILibraryRepo;

@Service
public class LibraryService implements ILibraryService {

	@Autowired
	private ILibraryRepo libraryRepo;
	
	@Override
	public Integer saveLibrary(Library library) {
		Library savedLibrary = libraryRepo.save(library);
		return savedLibrary.getId();
	}

	@Override
	public Optional<Library> getLibrary(Integer id) {
		return libraryRepo.findById(id);
	}

	@Override
	public List<Library> getAllLibraryBooks() {
		return libraryRepo.findAll();
	}

	@Override
	public Library updateLibrary(Library library, Integer id) {
		Library existingLibraryBook = libraryRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Library", "id", id));
				
				existingLibraryBook.setBookname(library.getBookname());
				existingLibraryBook.setBookauthor(library.getBookauthor());
				existingLibraryBook.setBookprice(library.getBookprice());
				existingLibraryBook.setBookgenre(library.getBookgenre());
				existingLibraryBook.setBorrowedstatus(library.getBorrowedstatus());
				
		libraryRepo.save(existingLibraryBook);		
		return existingLibraryBook;
	}

	
	@Override
	public Library updateLibraryBorrowStatus(Library library, Integer id) {
		Library existingLibraryBorrowStatus = libraryRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Library", "id", id));
		existingLibraryBorrowStatus.setBorrowedstatus(library.getBorrowedstatus());
		libraryRepo.save(existingLibraryBorrowStatus);
		return existingLibraryBorrowStatus;
	}
	
	@Override
	public void deleteLibrarybook(Integer id) {
		libraryRepo.deleteById(id);
		}


}
