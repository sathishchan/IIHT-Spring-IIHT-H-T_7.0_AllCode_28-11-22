package com.librarybook.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarybook.Entity.Library;

@Repository
public interface ILibraryRepo extends JpaRepository<Library, Integer> {

}
