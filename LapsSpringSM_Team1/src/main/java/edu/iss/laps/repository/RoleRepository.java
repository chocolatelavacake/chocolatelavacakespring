package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.Role;
import edu.iss.laps.model.RolePK;

public interface RoleRepository extends JpaRepository<Role, RolePK>{
	
	@Query("SELECT r.uid_ros FROM Role r")
	ArrayList<Integer> findUserIDs();
}