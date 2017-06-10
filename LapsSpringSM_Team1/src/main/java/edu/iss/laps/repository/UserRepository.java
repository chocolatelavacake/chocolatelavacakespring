package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query("SELECT u.uid_usr FROM User u")
	ArrayList<Integer> findUserIDs();
}
