package com.user.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.Entity.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

}
