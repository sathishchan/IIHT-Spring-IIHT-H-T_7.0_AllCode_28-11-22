package com.librarybook.Service;

import java.util.List;
import java.util.Optional;

import com.librarybook.Entity.Library;

public interface ILibraryService {
	
	Integer saveLibrary (Library library);
	
	Optional<Library> getLibrary(Integer id);
	
	public List<Library> getAllLibraryBooks();
	
	Library updateLibrary(Library library, Integer id);
	
	Library updateLibraryBorrowStatus(Library library, Integer id);
	
	public void deleteLibrarybook(Integer id);


}
