package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.Overtime;
import edu.iss.laps.model.OvertimePK;

public interface OvertimeRepository extends JpaRepository<Overtime, OvertimePK>{
	
	@Query("SELECT o.uid_ote FROM Overtime o")
	ArrayList<Integer> findUserIDs();
}