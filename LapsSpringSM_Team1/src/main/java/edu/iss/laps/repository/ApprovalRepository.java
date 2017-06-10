package edu.iss.laps.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.iss.laps.model.Approval;
import edu.iss.laps.model.ApprovalPK;

public interface ApprovalRepository extends JpaRepository<Approval, ApprovalPK>{
	
	@Query("SELECT a.uid_apl FROM Approval a")
	ArrayList<Integer> findUserIDs();
}